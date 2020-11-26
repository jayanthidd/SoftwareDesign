package com.acme.singleton.singletonexample;

public class SingletonThread {
    private static SingletonThread inst;
    private double randomNumber;

    private SingletonThread(){
        //here we can have all kinds of functionalities

        //we are going to generate a random number
        randomNumber = Math.random();
    }

    // it is important to consider thread safety because we want the class to be
    // instantiated. We need to prevent multiple threads from accessing this class simultaneously
    // and instantiating it multiple times.  Hence we make a synchronized method
    public static synchronized SingletonThread getInstance(){
        if(inst==null){
            inst = new SingletonThread();
        }
        return inst;
    }

    public String getInfo(){
        return "Hello from the threadsafe version " + randomNumber;
    }
}
