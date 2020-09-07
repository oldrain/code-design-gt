package app.singleton.p3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * IdGeneratorB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class DistributedIdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static DistributedIdGenerator instance;
    private static SharedObjectStorage<DistributedIdGenerator> storage = new FileSharedObjectStorage<>();
    private static DistributedLock lock = new RedisDistributedLock();

    private DistributedIdGenerator() {}

    public synchronized static DistributedIdGenerator getInstance() {
        if (instance == null) {
            lock.lock();
            instance = storage.load(DistributedIdGenerator.class);
        }
        return instance;
    }

    public synchronized void freeInstance() {
        storage.save(this, DistributedIdGenerator.class);
        instance = null;
        lock.unlock();
    }

    public long getId() {
        return id.incrementAndGet();
    }

    //DistributedIdGenerator idGenerator = DistributedIdGenerator.getInstance();
    //long id = idGenerator.getId();
    //idGenerator.freeInstance();

}
