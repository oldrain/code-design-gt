package app.bridge;

/**
 * SeverNotification
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SeverNotification extends Notification {

    public SeverNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String msg) {
        this.msgSender.send(msg);
    }

}
