package app.decorator;

/**
 * Adecorator
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ADecorator implements IA {

    private IA a;

    public ADecorator(IA a) {
        this.a = a;
    }

    @Override
    public void f() {
        // do something
        this.a.f();
        // do something
    }

}
