package app.singleton.p2;

/**
 * SingletonB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SingletonB {

    private static SingletonB instance = null;
    private final int paramA;
    private final int paramB;

    private SingletonB(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public synchronized static SingletonB getInstance(int paramA, int paramB) {
        if (instance == null) {
            instance = new SingletonB(paramA, paramB);
        }
        return instance;
    }

    //SingletonB singleton = SingletonB.getInstance(10, 50);

}
