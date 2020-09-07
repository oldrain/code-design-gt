package app.bridge;

import java.util.List;

/**
 * WechatMsgSender
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class WechatMsgSender implements MsgSender {

    private List<String> userIds;

    public WechatMsgSender(List<String> userIds) {
        this.userIds = userIds;
    }

    @Override
    public void send(String msg) {
        // do
    }

}
