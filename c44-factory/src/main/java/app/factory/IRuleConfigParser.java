package app.factory;

/**
 * RuleConfigParser
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface IRuleConfigParser {

    /**
     *
     * <p>
     * @param configText configText
     * @return app.factory.RuleConfig
     * @author roy
     *
     */
    RuleConfig parse(String configText);

}
