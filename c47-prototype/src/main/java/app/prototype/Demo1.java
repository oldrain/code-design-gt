package app.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Deme1
 *
 * Replace part
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Demo1 {

    private ConcurrentHashMap<String, SearchWord> currentKeywordMap = new ConcurrentHashMap<>();
    private Long lastUpdateTime = -1L;

    public void refresh() {
        List<SearchWord> toBeUpdatedSearchWords = this.getSearchWords(this.lastUpdateTime);
        Long maxNewUpdatedTime = this.lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (currentKeywordMap.containsKey(searchWord.getKeyword())) {
                currentKeywordMap.replace(searchWord.getKeyword(), searchWord);
            } else {
                currentKeywordMap.put(searchWord.getKeyword(), searchWord);
            }
        }

        this.lastUpdateTime = maxNewUpdatedTime;
    }

    private List<SearchWord> getSearchWords(Long lastUpdateTime) {
        // database
        // just updated rows
        return new ArrayList<>();
    }

}
