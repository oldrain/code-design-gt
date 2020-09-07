package app.bridge;

/**
 * UrgencyNotification
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class UrgencyNotification extends Notification {

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String msg) {
        this.msgSender.send(msg);
    }

}
