package app.p2array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HandlerA
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class HandlerA implements IHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandlerA.class);

    @Override
    public boolean handle() {
        boolean handled = false;

        LOGGER.info("run handlerA");

        return handled;
    }

}
