package app.p2;

import java.util.Map;

/**
 * GreaterExpression
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class GreaterExpression implements Expression {

    private String key;
    private long value;

    public GreaterExpression(String exp) {
        String[] elements = exp.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].trim().equals(ExpEnum.GT.getExp())) {
            throw new RuntimeException("Expression is invalid: " + exp);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    public GreaterExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(this.key)) {
            return false;
        }
        return stats.get(this.key) > this.value;
    }

}
