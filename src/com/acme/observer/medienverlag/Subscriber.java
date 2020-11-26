package com.acme.observer.medienverlag;

public interface Subscriber {
    void receiveArticle(String email, String post);
}
