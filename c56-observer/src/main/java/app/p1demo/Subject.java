package app.p1demo;

/**
 * Subject
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);

}
