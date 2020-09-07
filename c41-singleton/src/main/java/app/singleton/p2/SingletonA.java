package app.singleton.p2;

/**
 * SingletonA
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SingletonA {

    private static SingletonA instance = null;
    private final int paramA;
    private final int paramB;

    private SingletonA(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public static SingletonA getInstance() {
        if (instance == null) {
            throw new RuntimeException("Run init() first.");
        }
        return instance;
    }

    public synchronized static SingletonA init(int paramA, int paramB) {
        if (instance != null) {
            throw new RuntimeException("Singleton has been created.");
        }
        instance = new SingletonA(paramA, paramB);
        return instance;
    }

    //SingletonA.init(10, 50);
    //SingletonA singleton = SingletonA.getInstance();

}
