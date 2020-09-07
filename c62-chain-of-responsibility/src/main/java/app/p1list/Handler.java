package app.p1list;

/**
 * Handler
 *
 * @author roy
 * @version 1.0.0
 *
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = this.doHandle();
        if (this.successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();

}
