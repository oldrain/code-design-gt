package app.bridge;

import java.util.List;

/**
 * TelephoneMsgSender
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class TelephoneMsgSender implements MsgSender {

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String msg) {
        // do
    }

}
