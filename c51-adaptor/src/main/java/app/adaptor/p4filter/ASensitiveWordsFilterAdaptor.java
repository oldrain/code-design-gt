package app.adaptor.p4filter;

/**
 * ASensitiveWordsFilterAdaptor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private ASensitiveWordsFilter aFilter;

    @Override
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }

}
