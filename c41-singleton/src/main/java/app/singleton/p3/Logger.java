package app.singleton.p3;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Logger
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Logger {

    private static final ConcurrentHashMap<String, Logger> instanceMap = new ConcurrentHashMap<>();

    private Logger() {}

    public static Logger getInstance(String loggerName) {
        instanceMap.putIfAbsent(loggerName, new Logger());
        return instanceMap.get(loggerName);
    }

    public void log() {
        //
    }

    //Logger l1 = Logger.getInstance("User.class");
    //Logger l2 = Logger.getInstance("User.class");
    //Logger l3 = Logger.getInstance("Order.class");

}
