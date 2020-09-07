package app.p2array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HandlerB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class HandlerB implements IHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandlerB.class);

    @Override
    public boolean handle() {
        boolean handled = false;

        LOGGER.info("run handlerB");

        return handled;
    }

}
