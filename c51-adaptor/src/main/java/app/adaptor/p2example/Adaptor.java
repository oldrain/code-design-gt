package app.adaptor.p2example;

/**
 * Adaptor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Adaptor implements ITarget {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        this.adaptee.fa();
    }

    @Override
    public void f2() {
        this.adaptee.fb();
    }

    @Override
    public void fc() {
        this.adaptee.fc();
    }

}
