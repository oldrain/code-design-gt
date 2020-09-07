package app.p3finite;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MarioFiniteTest
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class MarioFiniteTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarioStateMachine.class);

    @Test
    public void TestMarioFinite() {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainFireFlower();
        LOGGER.info("Mario score: {}; state: {}", mario.getScore(), mario.getCurrentState());
    }

}
