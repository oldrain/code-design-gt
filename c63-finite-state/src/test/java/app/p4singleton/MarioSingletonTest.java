package app.p4singleton;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MarioSingletonTest
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class MarioSingletonTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarioSingletonTest.class);

    @Test
    public void TestMarioSingleton() {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        LOGGER.info("Mario score: {}; state: {}", mario.getScore(), mario.getCurrentState());
        mario.obtainCape();
        LOGGER.info("Mario score: {}; state: {}", mario.getScore(), mario.getCurrentState());
        mario.obtainFireFlower();
        LOGGER.info("Mario score: {}; state: {}", mario.getScore(), mario.getCurrentState());
        mario.meetMonster();
        LOGGER.info("Mario score: {}; state: {}", mario.getScore(), mario.getCurrentState());
    }

}
