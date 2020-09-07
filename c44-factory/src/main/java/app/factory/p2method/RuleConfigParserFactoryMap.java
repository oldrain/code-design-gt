package app.factory.p2method;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * RuleConfigParserFactoryMap
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class RuleConfigParserFactoryMap {

    private static final Map<String, IRuleConfigParserFactory> CACHED_FACTORIES = new HashMap<>();

    static {
        CACHED_FACTORIES.put("json", new JsonRuleConfigParserFactory());
        CACHED_FACTORIES.put("xml", new XmlRuleConfigParserFactory());
        CACHED_FACTORIES.put("yaml", new YamlRuleConfigParserFactory());
        CACHED_FACTORIES.put("properties", new PropertiesRuleConfigParserFactory());
    }

    private RuleConfigParserFactoryMap() {}

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (StringUtils.isEmpty(type) || !CACHED_FACTORIES.containsKey(type)) {
            return null;
        }

        return CACHED_FACTORIES.get(type);
    }

}
