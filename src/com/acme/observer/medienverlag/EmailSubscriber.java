package com.acme.observer.medienverlag;

public class EmailSubscriber implements Subscriber, SubscriptionType {

    private String title;
    private String content;

    private MediaPublisher mp;

    public EmailSubscriber(MediaPublisher mediaPublisher) {
        mp = mediaPublisher;
        mp.registerSubscriber(this);
    }

    @Override
    public void publish() {
        System.out.println("Article : " + title + " sent by email" );
    }

    @Override
    public void receiveArticle(String title, String content) {
        this.title = title;
        this.content = content;

        publish();
    }
}
