package com.acme.observer.medienverlag;

import java.util.ArrayList;

public class Publisher implements MediaPublisher{
    private String title;
    private String content;

    private ArrayList<Subscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    public void publishArticle(String title, String content){
        this.title = title;
        this.content = content;

        notifySubscribers();
    }

    @Override
    public void registerSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void unregisterSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber s : subscribers){
            s.receiveArticle(title, content);
        }
    }
}
