package app.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * OrExpression
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class OrExpression implements Expression {

    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String orExp) {
        String[] andExps = orExp.split("\\|\\|");
        for (String exp : andExps) {
            this.expressions.add(new AndExpression(exp));
        }
    }

    public OrExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expression : this.expressions) {
            if (expression.interpret(stats)) {
                return true;
            }
        }
        return false;
    }

}
