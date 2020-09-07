package app.p1list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HandleA
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class HandlerA extends Handler {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandlerA.class);

    @Override
    protected boolean doHandle() {
        boolean handled = false;

        LOGGER.info("run handlerA..");

        // ..
        return handled;
    }

}
