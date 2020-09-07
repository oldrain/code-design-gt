package app.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * AndExpression
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class AndExpression implements Expression {

    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(String andExp) {
        String[] andExps = andExp.split(ExpEnum.AND.getExp());
        for (String exp : andExps) {
            if (exp.contains(ExpEnum.GT.getExp())) {
                this.expressions.add(new GreaterExpression(exp));
            } else if (exp.contains(ExpEnum.LT.getExp())) {
                this.expressions.add(new LessExpression(exp));
            } else if (exp.contains(ExpEnum.EQ.getExp())) {
                this.expressions.add(new EqualExpression(exp));
            } else {
                throw new RuntimeException("Expression is invalid: " + exp);
            }
        }
    }

    public AndExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expression : this.expressions) {
            if (!expression.interpret(stats)) {
                return false;
            }
        }
        return true;
    }

}
