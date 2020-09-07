package app.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Demo4
 *
 * Deep copy
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Demo4 {

    private HashMap<String, SearchWord> currentKeywordMap = new HashMap<>();
    private Long lastUpdateTime = -1L;

    public void refresh() {
        HashMap<String, SearchWord> newKeywordMap = new HashMap<>();
        for (HashMap.Entry<String, SearchWord> e : this.currentKeywordMap.entrySet()) {
            SearchWord searchWord = e.getValue();
            SearchWord newSearchWord = new SearchWord();
            newSearchWord.setKeyword(searchWord.getKeyword());
            newSearchWord.setCount(searchWord.getCount());
            newSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
            newKeywordMap.put(e.getKey(), newSearchWord);
        }

        List<SearchWord> toBeUpdatedSearchWords = this.getSearchWords(this.lastUpdateTime);
        Long maxNewUpdatedTime = this.lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (newKeywordMap.containsKey(searchWord.getKeyword())) {
                SearchWord oldSearchWord = newKeywordMap.get(searchWord.getKeyword());
                oldSearchWord.setCount(searchWord.getCount());
                oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
            } else {
                newKeywordMap.put(searchWord.getKeyword(), searchWord);
            }
        }

        this.lastUpdateTime = maxNewUpdatedTime;
        this.currentKeywordMap = newKeywordMap;
    }

    private List<SearchWord> getSearchWords(Long lastUpdateTime) {
        // database
        // just updated rows
        return new ArrayList<>();
    }

    public Object deepCopy(Object object) {
        Object obj = null;

        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(object);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            obj = oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // todo
        }

        return obj;
    }

}
