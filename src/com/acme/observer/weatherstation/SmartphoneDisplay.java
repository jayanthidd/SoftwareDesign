package com.acme.observer.weatherstation;

public class SmartphoneDisplay implements Observer, DisplayElement {

    private double temperature;
    private double pressure;

    private Subject weatherData;

    public SmartphoneDisplay(Subject subject) {
        this.weatherData = subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Smartphone : " + temperature + " " + pressure);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        display();
    }
}
