package com.acme.singleton.singletonexample;

public class Demo {
    public static void main(String[] args) {
        SingletonThread t = SingletonThread.getInstance();
        System.out.println(t.getInfo());
        //we will repeat this later somewhere else and see that
        // I still have the same object

        testMethod();
    }

    public static void testMethod(){
        SingletonThread t2 = SingletonThread.getInstance();
        System.out.println(t2.getInfo());
    }
}
