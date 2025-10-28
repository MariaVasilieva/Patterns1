package org.example.observer;

public interface MediaSubject {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyObservers(String eventType, String message);
}
