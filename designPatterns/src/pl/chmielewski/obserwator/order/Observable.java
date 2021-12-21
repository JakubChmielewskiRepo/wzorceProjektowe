package pl.chmielewski.obserwator.order;

import pl.chmielewski.obserwator.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
