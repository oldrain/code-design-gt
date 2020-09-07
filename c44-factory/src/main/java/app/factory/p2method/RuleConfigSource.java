package app.factory.p2method;

import app.factory.IRuleConfigParser;
import app.factory.InvalidRuleConfigException;
import app.factory.RuleConfig;
import org.apache.commons.lang3.StringUtils;

/**
 * RuleConfigSource
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String fileExtension = this.getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(fileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException("");
        }

        IRuleConfigParser parser = parserFactory.createParser();

        // loaded from file
        String configText = "";
        return parser.parse(configText);
    }

    private String getFileExtension(String filePath) {
        String[] split = StringUtils.split(filePath, ".");
        return split[split.length - 1];
    }

}
