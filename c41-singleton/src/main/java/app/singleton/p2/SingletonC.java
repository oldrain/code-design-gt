package app.singleton.p2;

/**
 * SingletonC
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SingletonC {

    private static SingletonC instance = null;
    private final int paramA;
    private final int paramB;

    private SingletonC() {
        this.paramA = Config.PARAM_A;
        this.paramB = Config.PARAM_B;
    }

    public synchronized static SingletonC getInstance() {
        if (instance == null) {
            instance = new SingletonC();
        }
        return instance;
    }

}
