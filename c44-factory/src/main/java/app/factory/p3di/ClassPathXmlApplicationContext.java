package app.factory.p3di;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassPathXmlApplicationContext
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);

    public ClassPathXmlApplicationContext(String cfgLocation) {
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();

        this.loadBeanDefinition(cfgLocation);
    }

    private void loadBeanDefinition(String cfgLocation) {
        InputStream in = null;
        try {
            in = this.getClass().getResourceAsStream("/" + cfgLocation);
            if (in == null) {
                throw new BeanConfigFileNotExistsException("Can not find config file :" + cfgLocation);
            }

            beansFactory.addBeanDefinitions(this.beanConfigParser.parse(in));

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
    }

    @Override
    public Object getBean(String beanId) {
        return this.beansFactory.getBean(beanId);
    }

}
