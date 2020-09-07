package app.p1demo.create;

import app.p1demo.def.ConcreteStrategyA;
import app.p1demo.def.ConcreteStrategyB;
import app.p1demo.def.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * StrategyFactoryA
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class StrategyFactoryA {

    private static final Map<String, Strategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put("A", new ConcreteStrategyA());
        strategyMap.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategyMap.get(type);
    }

}
