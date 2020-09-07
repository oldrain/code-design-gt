package app.bridge;

/**
 * Notification
 *
 * @author roy
 * @version 1.0.0
 *
 */
public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    /**
     * notify
     *
     * <p>
     * @param msg msg
     * @author roy
     *
     */
    public abstract void notify(String msg);

}
