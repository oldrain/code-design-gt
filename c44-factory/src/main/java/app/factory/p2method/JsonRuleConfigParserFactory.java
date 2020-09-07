package app.factory.p2method;

import app.factory.IRuleConfigParser;
import app.factory.JsonRuleConfigParser;

/**
 * JsonIRuleConfigParserFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }

}
