package app.factory.p3di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * App
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        TestA testA = (TestA)applicationContext.getBean("testA");
        LOGGER.info("{}", testA.test());
    }

}
