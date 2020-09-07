package app.p2;

import java.util.Map;

/**
 * Expression
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface Expression {

    boolean interpret(Map<String, Long> stats);

}
