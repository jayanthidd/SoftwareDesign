package com.acme.observer.weatherstation;

import java.util.ArrayList;

public class WetterStation implements Subject {

    private double temperature;
    private double humidity;
    private double pressure;
    private ArrayList<Observer> observers;

    public WetterStation() {
        observers = new ArrayList<>();
    }

    //we simulate the change to measurements
    public void setMeasurements( double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        if(o != null && !observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(o!=null) {
            observers.remove(o);
        }
    }

    // to inform all observers of any change in data
    @Override
    public void notifyObservers() {
        for(Observer o : observers)
            o.update(temperature,humidity,pressure);
    }
}
