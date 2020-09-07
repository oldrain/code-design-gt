package app.singleton.p1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * IdGeneratorB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class IdGeneratorB {

    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorB instance;

    private IdGeneratorB() {}

    public static synchronized IdGeneratorB getInstance() {
        if (instance == null) {
            instance = new IdGeneratorB();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
