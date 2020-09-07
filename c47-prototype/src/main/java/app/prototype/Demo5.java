package app.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Demo5
 *
 * Shallow copy + replace
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Demo5 {

    private HashMap<String, SearchWord> currentKeywordMap = new HashMap<>();
    private Long lastUpdateTime = -1L;

    public void refresh() {
        // Shallow copy
        HashMap<String, SearchWord> newKeywordMap = (HashMap<String, SearchWord>) this.currentKeywordMap.clone();

        List<SearchWord> toBeUpdatedSearchWords = this.getSearchWords(this.lastUpdateTime);
        Long maxNewUpdatedTime = this.lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (this.currentKeywordMap.containsKey(searchWord.getKeyword())) {
                newKeywordMap.remove(searchWord.getKeyword());
            }
            newKeywordMap.put(searchWord.getKeyword(), searchWord);
        }

        this.lastUpdateTime = maxNewUpdatedTime;
        this.currentKeywordMap = newKeywordMap;
    }

    private List<SearchWord> getSearchWords(Long lastUpdateTime) {
        // database
        // just updated rows
        return new ArrayList<>();
    }

}
