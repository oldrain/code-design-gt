package app.adaptor.p4filter;

/**
 * CSensitiveWordsFilterAdaptor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class CSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private CSensitiveWordsFilter cFilter;

    @Override
    public String filter(String text) {
        return cFilter.filter(text, "****");
    }

}
