package app.p1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ExpressionInterpreter
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ExpressionInterpreter {

    private Deque<Expression> numbers = new LinkedList<>();

    /**
     *  8 3 2 4 - + *
     */
    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length+1)/2; i++) {
            numbers.addLast(new NumberExpression(elements[i]));
        }

        for (int i = (length+1)/2; i < length; i++) {
            String operator = elements[i];
            if (!OperatorEnum.isValidOperator(operator)) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            Expression exp1 = this.numbers.pollFirst();
            Expression exp2 = this.numbers.pollFirst();
            Expression mix  = null;

            if (OperatorEnum.ADD.getOperator().equals(operator)) {
                mix = new AdditionExpression(exp1, exp2);
            } else if (OperatorEnum.SUB.getOperator().equals(operator)) {
                mix = new SubtractionExpression(exp1, exp2);
            } else if (OperatorEnum.MUL.getOperator().equals(operator)) {
                mix = new MultiplicationExpression(exp1, exp2);
            } else if (OperatorEnum.DIV.getOperator().equals(operator)) {
                mix = new DivisionExpression(exp1, exp2);
            }

            if (mix == null) {
                throw new RuntimeException("Mix is null: " + expression);
            }

            long result = mix.interpret();
            this.numbers.addFirst(new NumberExpression(result));
        }

        if (this.numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }

        return this.numbers.pop().interpret();
    }

}
