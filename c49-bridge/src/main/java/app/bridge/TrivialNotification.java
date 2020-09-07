package app.bridge;

/**
 * TrivialNotification
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class TrivialNotification extends Notification {

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String msg) {
        this.msgSender.send(msg);
    }

}
