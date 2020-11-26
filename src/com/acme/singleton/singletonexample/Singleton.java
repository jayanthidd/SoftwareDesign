package com.acme.singleton.singletonexample;

public class Singleton {

    private static Singleton inst;

    //the constructor is private so that no one outside can access it or instantiate this class
    private Singleton() {
        // we can have all kinds of functionalities
    }

    //methods will be static here to create an instance of a Singleton
    public static Singleton getInstance(){
        // it is important to consider thread safety because we want the class to be
        // instantiated. We need to prevent multiple threads from accessing this class simultaneously
        // and instantiating it multiple times.  The next example will take care of that
        if(inst==null){
            inst = new Singleton(); // create the first and only instance of the class
        }
        return inst;
    }

    // we will have the rest of the functionality here
    // methods to access a db
    // methods to change settings

}
