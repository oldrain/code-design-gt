package app;

/**
 * Request
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Request {

    private EventEnum eventEnum;

    private Data data;

    public EventEnum getEventEnum() {
        return eventEnum;
    }

    public void setEventEnum(EventEnum eventEnum) {
        this.eventEnum = eventEnum;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
