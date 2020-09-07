package app.factory.p2method;

import app.factory.IRuleConfigParser;
import app.factory.PropertiesRuleConfigParser;

/**
 * PropertiesRuleConfigParserFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }

}
