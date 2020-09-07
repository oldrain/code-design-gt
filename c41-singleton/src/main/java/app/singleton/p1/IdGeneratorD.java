package app.singleton.p1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * IdGeneratorD
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class IdGeneratorD {

    private AtomicLong id = new AtomicLong(0);

    private IdGeneratorD() {}

    private static class SingletonHolder {
        private static final IdGeneratorD instance = new IdGeneratorD();
    }

    public static IdGeneratorD getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
