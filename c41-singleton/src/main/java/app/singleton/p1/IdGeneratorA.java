package app.singleton.p1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * IdGeneratorA
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class IdGeneratorA {

    private AtomicLong id = new AtomicLong(0);
    private static final IdGeneratorA instance = new IdGeneratorA();

    private IdGeneratorA() {}

    public static IdGeneratorA getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
