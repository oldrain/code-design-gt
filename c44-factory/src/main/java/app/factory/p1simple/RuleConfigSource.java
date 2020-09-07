package app.factory.p1simple;

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
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(fileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException("");
        }

        // loaded from file
        String configText = "";
        return parser.parse(configText);
    }

    private String getFileExtension(String filePath) {
        String[] split = StringUtils.split(filePath, ".");
        return split[split.length - 1];
    }

}
