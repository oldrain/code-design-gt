package app.factory.p3di;

/**
 * BeanCreationFailureException
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class BeanCreationFailureException extends RuntimeException {

    public BeanCreationFailureException(String msg, Throwable e) {
        super(msg, e);
    }

}
