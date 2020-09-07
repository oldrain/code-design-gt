package app.prototype;

/**
 * SearchWord
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SearchWord {

    private String keyword;
    private Integer count;
    private Long lastUpdateTime;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
