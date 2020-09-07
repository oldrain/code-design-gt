package app.template.p2callback;

/**
 * AClass
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class AClass {

    public static void main(String[] args) {
        BClass b = new BClass();
        b.process(new ICallback() {
            @Override
            public void methodToCallback() {
                System.out.println("Call back me.");
            }
        });
    }

}
