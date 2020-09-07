package app.singleton.p3;

/**
 * lock
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface DistributedLock {

    /**
     * lock
     *
     * <p>
     *
     * @author roy
     *
     */
    void lock();

    /**
     * unlock
     *
     * <p>
     *
     * @author roy
     *
     */
    void unlock();

}
