package app.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Demo2
 *
 * Replace all
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Demo2 {

    private HashMap<String, SearchWord> currentKeywordMap = new HashMap<>();

    public void refresh() {
        HashMap<String, SearchWord> newKeywordMap = new HashMap<>();

        List<SearchWord> toBeUpdatedSearchWords = this.getSearchWords();
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            newKeywordMap.put(searchWord.getKeyword(), searchWord);
        }

        this.currentKeywordMap = newKeywordMap;
    }

    private List<SearchWord> getSearchWords() {
        // database all
        return new ArrayList<>();
    }

}
