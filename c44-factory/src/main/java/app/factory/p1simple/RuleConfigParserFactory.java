package app.factory.p1simple;

import app.factory.*;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * RuleConfigParserFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class RuleConfigParserFactory {

    private static final Map<String, IRuleConfigParser> CACHED_PARSERS = new HashMap<>();

    static {
        CACHED_PARSERS.put("json", new JsonRuleConfigParser());
        CACHED_PARSERS.put("xml", new XmlRuleConfigParser());
        CACHED_PARSERS.put("yaml", new YamlRuleConfigParser());
        CACHED_PARSERS.put("properties", new PropertiesRuleConfigParser());
    }

    private RuleConfigParserFactory() {}

    public static IRuleConfigParser createParser(String type) {
        if (StringUtils.isEmpty(type) || !CACHED_PARSERS.containsKey(type)) {
            return null;
        }

        return CACHED_PARSERS.get(type);
    }

}
