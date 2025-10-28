package org.example.observer;

public interface Subscriber {
    void update(String eventType, String message);
}
