package app.bridge;

import java.util.List;

/**
 * EmailMsgSender
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class EmailMsgSender implements MsgSender {

    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String msg) {
        // do
    }

}
