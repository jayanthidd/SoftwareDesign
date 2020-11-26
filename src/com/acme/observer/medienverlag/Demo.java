package com.acme.observer.medienverlag;

public class Demo {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        EmailSubscriber es = new EmailSubscriber(publisher);
        publisher.publishArticle("Title - Online Education : ", "Content - ytcrvy kufdby rvcyjubgexkun");

        System.out.println("--------------");
        PostSubscriber ps = new PostSubscriber(publisher);
        publisher.publishArticle("Title - COVID-19 : ", "Content - acbauegjtyfewujnxsy");
    }
}
