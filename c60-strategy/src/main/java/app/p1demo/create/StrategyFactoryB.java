package app.p1demo.create;

import app.p1demo.def.ConcreteStrategyA;
import app.p1demo.def.ConcreteStrategyB;
import app.p1demo.def.Strategy;

/**
 * StrategyFactoryB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class StrategyFactoryB {

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not empty");
        }

        if ("A".equals(type)) {
            return new ConcreteStrategyA();
        } else if ("B".equals(type)) {
            return new ConcreteStrategyB();
        }

        return null;
    }

}
