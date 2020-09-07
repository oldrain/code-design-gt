package app.p2table;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MarioTableTest
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class MarioTableTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarioStateMachine.class);

    @Test
    public void testMarioBranch() {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainFireFlower();
        LOGGER.info("Mario score: {}; state: {}", mario.getScore(), mario.getCurrentState());
    }

}
