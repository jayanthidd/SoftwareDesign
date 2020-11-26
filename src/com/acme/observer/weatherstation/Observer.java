package com.acme.observer.weatherstation;
/*
Observer Pattern : Observer
 */
public interface Observer {
    void update(double temp, double humidity, double pressure);
}
