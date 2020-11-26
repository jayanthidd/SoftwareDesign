package com.acme.observer.weatherstation;
/*
Observer Pattern : Subject
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(); // informs all observers when something changes
}
