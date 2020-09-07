package app.factory.p3di;

/**
 * TestA
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class TestA {

    private TestB b;

    public TestA(TestB b) {
        this.b = b;
    }

    public String test() {
        return this.b.test();
    }

}
