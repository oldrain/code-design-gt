package app.p2array;

import java.util.ArrayList;
import java.util.List;

/**
 * HandlerChain
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : this.handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }

}
