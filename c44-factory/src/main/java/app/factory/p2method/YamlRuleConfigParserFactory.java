package app.factory.p2method;

import app.factory.IRuleConfigParser;
import app.factory.YamlRuleConfigParser;

/**
 * YamlRuleConfigParserFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }

}
