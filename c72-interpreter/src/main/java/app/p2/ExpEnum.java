package app.p2;

/**
 * ExpEnum
 *
 * @author roy
 * @version 1.0.0
 *
 */
public enum ExpEnum {

    /**
     *
     */
    LB("("),
    RB(")"),

    GT(">"),
    LT("<"),
    EQ("=="),

    AND("&&"),

    OR("||"),
    ;

    private String exp;

    private ExpEnum(String exp) {
        this.exp = exp;
    }

    public String getExp() {
        return this.exp;
    }

}
