package app;

/**
 * Event
 *
 * @author roy
 * @version 1.0.0
 *
 */
public enum Event {

    /**
     *
     */
    GOT_MUSHROOM(0),
    GOT_CAP(1),
    GOT_FIRE(2),
    MET_MONSTER(3)
    ;

    private int value;

    private Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
