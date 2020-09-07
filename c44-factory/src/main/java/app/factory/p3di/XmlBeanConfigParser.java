package app.factory.p3di;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * XmlBeanConfigParser
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class XmlBeanConfigParser implements BeanConfigParser {

    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        return this.parseForTest();
    }

    @Override
    public List<BeanDefinition> parse(String cfgContent) {
        return new ArrayList<>();
    }

    private List<BeanDefinition> parseForTest() {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();

        BeanDefinition definitionA = new BeanDefinition();
        definitionA.setId("testA");
        definitionA.setClassName(TestA.class.getName());
        List<BeanDefinition.ConstructorArg> argListA = new ArrayList<>();
        BeanDefinition.ConstructorArg argTestA = new BeanDefinition.ConstructorArg.Builder()
                .setIsRef(true)
                .setArg("testB")
                .build();
        argListA.add(argTestA);
        definitionA.setConstructorArgs(argListA);

        beanDefinitions.add(definitionA);

        BeanDefinition definitionB = new BeanDefinition();
        definitionB.setId("testB");
        definitionB.setClassName(TestB.class.getName());
        definitionB.setScope(BeanDefinition.Scope.SINGLETON);
        definitionB.setLazeInit(true);
        List<BeanDefinition.ConstructorArg> argListB = new ArrayList<>();
        BeanDefinition.ConstructorArg argTestB1 = new BeanDefinition.ConstructorArg.Builder()
                .setType(String.class)
                .setArg("127.0.0.1")
                .build();
        argListB.add(argTestB1);
        BeanDefinition.ConstructorArg argTestB2 = new BeanDefinition.ConstructorArg.Builder()
                .setType(Integer.class)
                .setArg(1234)
                .build();
        argListB.add(argTestB2);
        definitionB.setConstructorArgs(argListB);

        beanDefinitions.add(definitionB);

        return beanDefinitions;
    }

}
