package app.template.p1demo;

/**
 * AbstractClass
 *
 * @author roy
 * @version 1.0.0
 *
 */
public abstract class AbstractClass {

    public final void templateMethod() {
        // ...
        this.method1();
        // ...
        this.method2();
        // ...
    }

    protected abstract void method1();
    protected abstract void method2();

}
