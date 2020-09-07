package app.p1branch;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MarioBranchTest
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class MarioBranchTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarioBranchTest.class);

    @Test
    public void testMarioBranch() {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        LOGGER.info("Mario score: {}; state: {}", mario.getScore(), mario.getCurrentState());
    }

}
