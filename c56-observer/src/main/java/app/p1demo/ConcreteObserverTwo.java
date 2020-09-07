package app.p1demo;

/**
 * ConcreteObserverTwo
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ConcreteObserverTwo implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverTwo is notified.");
    }

}
