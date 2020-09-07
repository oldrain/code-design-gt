package app.factory.p2method;

import app.factory.IRuleConfigParser;

/**
 * IRuleConfigParserFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface IRuleConfigParserFactory {

    /**
     *
     * <p>
     * @return app.factory.IRuleConfigParser
     * @author roy
     *
     */
    IRuleConfigParser createParser();

}
