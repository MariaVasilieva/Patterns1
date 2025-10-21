package org.example.Observer;

public interface Subscriber {
    void update(String eventType, String message);
}
