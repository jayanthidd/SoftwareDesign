package com.acme.observer.medienverlag;
//subject
public interface MediaPublisher {
    void registerSubscriber(Subscriber s);
    void unregisterSubscriber(Subscriber s);
    void notifySubscribers();
}
