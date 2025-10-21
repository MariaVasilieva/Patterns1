package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubsriberManager implements MediaSubject{
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber + "subscribed");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber + "unsubscribed");
    }

    @Override
    public void notifyObservers(String eventType, String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(eventType, message);
        }
    }
}
