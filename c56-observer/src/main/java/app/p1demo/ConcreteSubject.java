package app.p1demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : this.observers) {
            observer.update(message);
        }
    }

}
