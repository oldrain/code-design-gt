package app.enums;

/**
 * ActionEnum
 *
 * @author roy
 * @version 1.0.0
 *
 */
public enum ActionEnum {

    /**
     *
     */
    LOGIN("login"),
    REGISTER("register"),
    ;

    private String action;

    private ActionEnum(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
