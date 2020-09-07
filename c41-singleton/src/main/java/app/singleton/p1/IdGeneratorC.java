package app.singleton.p1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * IdGeneratorC
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class IdGeneratorC {

    private AtomicLong id = new AtomicLong(0);
    private static volatile IdGeneratorC instance;

    private IdGeneratorC() {}

    public static IdGeneratorC getInstance() {
        if (instance == null) {
            synchronized (IdGeneratorC.class) {
                if (instance == null) {
                    instance = new IdGeneratorC();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
