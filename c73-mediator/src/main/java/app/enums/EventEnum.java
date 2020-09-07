package app.enums;

/**
 * EventEnum
 *
 * @author roy
 * @version 1.0.0
 *
 */
public enum EventEnum {

    /**
     *
     */
    CLICK("click"),
    CHANGE("change"),
    ;

    private String event;

    private EventEnum(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }
}
