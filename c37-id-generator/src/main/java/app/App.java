package app;

import app.generator.IdGenerationFailureException;
import app.generator.RandomIdGenerator;
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

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        RandomIdGenerator generator = new RandomIdGenerator();
        try {
            String id = generator.generate();
            logger.info("id: {}", id);
        } catch (IdGenerationFailureException e) {
            logger.error("generate error");
        }
    }

}
