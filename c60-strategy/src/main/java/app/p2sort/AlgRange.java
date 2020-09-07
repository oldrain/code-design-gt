package app.p2sort;

/**
 * AlgRange
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class AlgRange {

    private long start;
    private long end;
    private ISortAlg alg;

    public AlgRange(long start, long end, ISortAlg alg) {
        this.start = start;
        this.end = end;
        this.alg = alg;
    }

    public ISortAlg getAlg() {
        return this.alg;
    }

    public boolean inRange(long size) {
        return (size >= start) && (size < end);
    }

}
