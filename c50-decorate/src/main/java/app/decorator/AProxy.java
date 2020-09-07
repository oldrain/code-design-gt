package app.decorator;

/**
 * AProxy
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class AProxy implements IA {

    private IA a;

    public AProxy(IA a) {
        this.a = a;
    }

    @Override
    public void f() {
        // do something
        this.a.f();
        // do something
    }

}
