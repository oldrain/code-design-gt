package app.p2eventbus;

import java.util.concurrent.Executor;

/**
 * AsyncEventBus
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }

}
