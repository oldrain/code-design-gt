package app.p2;

import java.util.Map;

/**
 * AlertRuleInterpreter
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class AlertRuleInterpreter {

    private Expression expression;

    public AlertRuleInterpreter(String ruleExp) {
        this.expression = new OrExpression(ruleExp);
    }

    public boolean interpret(Map<String, Long> stats) {
        return this.expression.interpret(stats);
    }

}
