package app.adaptor.p4filter;

/**
 * BSensitiveWordsFilterAdaptor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private BSensitiveWordsFilter bFilter;

    @Override
    public String filter(String text) {
        return bFilter.filter(text);
    }

}
