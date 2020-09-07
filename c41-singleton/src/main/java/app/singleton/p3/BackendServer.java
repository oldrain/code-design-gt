package app.singleton.p3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * BackendServer
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class BackendServer {

    private long serverNo;
    private String serverAddress;

    private static final int SERVER_COUNT = 3;
    private static final Map<Long, BackendServer> instanceMap = new HashMap<>();

    static {
        instanceMap.put(1L, new BackendServer(1L, "192.168.199.110:8080"));
        instanceMap.put(2L, new BackendServer(2L, "192.168.199.111:8080"));
        instanceMap.put(3L, new BackendServer(3L, "192.168.199.112:8080"));
    }

    private BackendServer(long serverNo, String serverAddress) {
        this.serverNo = serverNo;
        this.serverAddress = serverAddress;
    }

    public BackendServer getInstance(long serverNo) {
        return instanceMap.get(serverNo);
    }

    public BackendServer getRandomInstance() {
        Random random = new Random();
        int no = random.nextInt(SERVER_COUNT) + 1;
        return instanceMap.get((long)no);
    }

}
