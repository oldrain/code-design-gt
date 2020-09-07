package app.p1demo;

/**
 * ConcreteObserverOne
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ConcreteObserverOne implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverOne is notified.");
    }

}
