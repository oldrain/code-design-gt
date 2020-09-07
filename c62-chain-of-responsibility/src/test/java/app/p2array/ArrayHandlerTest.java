package app.p2array;

import org.junit.Test;

/**
 * ArrayHandlerTest
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ArrayHandlerTest {

    @Test
    public void TestArrayHandlerChain() {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }

}
