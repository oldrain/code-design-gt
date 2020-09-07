package app.factory.p2method;

import app.factory.IRuleConfigParser;
import app.factory.XmlRuleConfigParser;

/**
 * XmlIRuleConfigParserFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }

}
