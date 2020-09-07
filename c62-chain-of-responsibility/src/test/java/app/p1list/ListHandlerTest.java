package app.p1list;

import org.junit.Test;

/**
 * ListHandlerTest
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ListHandlerTest {

    @Test
    public void testListHandlerChain() {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }

}
