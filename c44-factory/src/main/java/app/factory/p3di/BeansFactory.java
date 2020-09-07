package app.factory.p3di;

import com.google.common.annotations.VisibleForTesting;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class BeansFactory {

    private ConcurrentHashMap<String, Object> singletonObjectMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public void addBeanDefinitions(List<BeanDefinition> beanDefinitions) {
        for (BeanDefinition beanDefinition : beanDefinitions) {
            this.beanDefinitionMap.putIfAbsent(beanDefinition.getId(), beanDefinition);

            if (!beanDefinition.isLazeInit() && beanDefinition.isSingleton()) {
                this.createBean(beanDefinition);
            }
        }
    }

    public Object getBean(String beanId) {
        BeanDefinition beanDefinition = this.beanDefinitionMap.get(beanId);
        if (beanDefinition == null) {
            throw new NoSuchBeanDefinitionException("Bean is no defined: " + beanId);
        }
        return this.createBean(beanDefinition);
    }

    @VisibleForTesting
    protected Object createBean(BeanDefinition beanDefinition) {
        if (beanDefinition.isSingleton() && this.singletonObjectMap.contains(beanDefinition.getId())) {
            return singletonObjectMap.get(beanDefinition.getId());
        }

        Object bean = null;

        try {
            Class<?> beanClass = Class.forName(beanDefinition.getClassName());
            List<BeanDefinition.ConstructorArg> args = beanDefinition.getConstructorArgs();

            if (args.isEmpty()) {
                bean = beanClass.newInstance();
            } else {
                Class<?>[] argClasses = new Class[args.size()];
                Object[] argObjects = new Object[args.size()];
                for (int i = 0; i < args.size(); i++) {
                    BeanDefinition.ConstructorArg arg = args.get(i);
                    if (!arg.isRef()) {
                        argClasses[i] = arg.getType();
                        argObjects[i] = arg.getArg();
                    } else {
                        BeanDefinition refBeanDefinition = this.beanDefinitionMap.get(arg.getArg().toString());
                        if (refBeanDefinition == null) {
                            throw new NoSuchBeanDefinitionException("Bean is not defined: " + arg.getArg());
                        }
                        argClasses[i] = Class.forName(refBeanDefinition.getClassName());
                        argObjects[i] = this.createBean(refBeanDefinition);
                    }
                }
                bean = beanClass.getConstructor(argClasses).newInstance(argObjects);
            }

            if (bean != null && beanDefinition.isSingleton()) {
                this.singletonObjectMap.putIfAbsent(beanDefinition.getId(), bean);
            }

            return bean;

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
                | NoSuchMethodException | InvocationTargetException e) {
            throw new BeanCreationFailureException("Creat bean failure", e);
        }
    }

}
