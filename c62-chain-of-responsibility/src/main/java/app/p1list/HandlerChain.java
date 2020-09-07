package app.p1list;

/**
 * HandlerChain
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class HandlerChain {

    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);

        if (this.head == null) {
            this.head = handler;
            this.tail = handler;
            return;
        }

        this.tail.setSuccessor(handler);
        this.tail = handler;
    }

    public void handle() {
        if (this.head != null) {
            this.head.handle();
        }
    }

}
