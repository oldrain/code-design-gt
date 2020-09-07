package app.singleton.p1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * IdGeneratorE
 *
 * @author roy
 * @version 1.0.0
 *
 */
public enum IdGeneratorE {

    /**
     *
     */
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

}
