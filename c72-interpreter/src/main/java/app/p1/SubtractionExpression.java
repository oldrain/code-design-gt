package app.p1;

/**
 * SubtractionExpression
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SubtractionExpression implements Expression {

    private Expression exp1;
    private Expression exp2;

    public SubtractionExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return this.exp1.interpret() - this.exp2.interpret();
    }

}
