package com.acme.observer.medienverlag;

public class PostSubscriber implements Subscriber, SubscriptionType {
    private String title;
    private String content;

    private String postAddress;

    private MediaPublisher mp;

    public PostSubscriber(MediaPublisher mp) {
        this.mp = mp;
        mp.registerSubscriber(this);
    }

    @Override
    public void receiveArticle(String title, String content) {
        this.title = title;
        this.content = content;

        publish();
    }

    @Override
    public void publish() {
        System.out.println("Article : " + title + " sent by post");
    }
}
