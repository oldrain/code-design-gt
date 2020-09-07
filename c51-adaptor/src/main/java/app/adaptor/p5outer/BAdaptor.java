package app.adaptor.p5outer;

/**
 * BAdaptor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class BAdaptor implements IA {

    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    @Override
    public void fa() {
        // ...
        b.fb();
        // ...
    }

    // Demo d = new Demo(new BAdaptor(new B())

}
