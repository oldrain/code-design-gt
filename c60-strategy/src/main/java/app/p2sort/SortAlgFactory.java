package app.p2sort;

import java.util.HashMap;
import java.util.Map;

/**
 * SortAlgFactory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SortAlgFactory {

    private static final Map<String, ISortAlg> algMap = new HashMap<>();

    static {
        algMap.put("QuickSort", new QuickSort());
        algMap.put("ExternalSort", new ExternalSort());
        algMap.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algMap.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type should not empty.");
        }
        return algMap.get(type);
    }

}
