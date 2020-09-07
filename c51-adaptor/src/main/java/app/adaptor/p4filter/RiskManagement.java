package app.adaptor.p4filter;

import java.util.ArrayList;
import java.util.List;

/**
 * RiskManagement
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class RiskManagement {

    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter) {
        filters.add(filter);
    }

    public String filterSensitiveWords(String text) {
        String maskedText = text;
        for (ISensitiveWordsFilter filter : filters) {
            maskedText = filter.filter(maskedText);
        }
        return maskedText;
    }

}
