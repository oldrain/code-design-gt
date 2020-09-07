package app.p2sort;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * SorterB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SorterB {

    private static final long GB = 1000 * 1000 * 1000;

    private static final List<AlgRange> algRanges = new ArrayList<>();

    static {
        algRanges.add(new AlgRange(0, 6*GB, SortAlgFactory.getSortAlg("QuickSort")));
        algRanges.add(new AlgRange(6*GB, 10*GB, SortAlgFactory.getSortAlg("ExternalSort")));
        algRanges.add(new AlgRange(10*GB, 100*GB, SortAlgFactory.getSortAlg("ConcurrentExternalSort")));
        algRanges.add(new AlgRange(100*GB, Long.MAX_VALUE, SortAlgFactory.getSortAlg("MapReduceSort")));
    }

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        for (AlgRange algRange : algRanges) {
            if (algRange.inRange(fileSize)) {
                sortAlg = algRange.getAlg();
                break;
            }
        }
        if (sortAlg != null) {
            sortAlg.sort(filePath);
        }
    }

}
