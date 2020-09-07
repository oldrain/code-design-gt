package app.singleton.p3;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * multi instance
 *
 * ThreadLocal
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ThreadIdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long, ThreadIdGenerator> instanceMap = new ConcurrentHashMap<>();

    private ThreadIdGenerator() {}

    public static ThreadIdGenerator getInstance() {
        Long localThreadId = Thread.currentThread().getId();
        instanceMap.putIfAbsent(localThreadId, new ThreadIdGenerator());
        return instanceMap.get(localThreadId);
    }

    public long getId() {
        return this.id.incrementAndGet();
    }

}
