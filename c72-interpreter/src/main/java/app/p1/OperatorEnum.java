package app.p1;

/**
 * ExpEnum
 *
 * @author roy
 * @version 1.0.0
 *
 */
public enum OperatorEnum {

    /**
     *
     */
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    ;

    private String operator;

    private OperatorEnum(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public static boolean isValidOperator(String operator) {
        return ADD.getOperator().equals(operator) || SUB.getOperator().equals(operator)
                || MUL.getOperator().equals(operator) || DIV.getOperator().equals(operator);
    }

}
