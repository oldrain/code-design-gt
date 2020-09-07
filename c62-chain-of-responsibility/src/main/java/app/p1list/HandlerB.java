package app.p1list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HandleB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class HandlerB extends Handler {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandlerB.class);

    @Override
    protected boolean doHandle() {
        boolean handled = false;

        LOGGER.info("run handlerB...");

        // ..
        return handled;
    }

}
