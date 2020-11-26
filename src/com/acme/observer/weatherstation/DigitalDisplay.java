package com.acme.observer.weatherstation;
// simple display which hangs on the wall.
// this will implement Observer as well as a DisplayElement
public class DigitalDisplay implements DisplayElement, Observer{
    //Simple display can only show Temperature
    private double temperature;

    //a reference to our subject
    private Subject weatherData;

    public DigitalDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /*
    This method has nothing to do with the observer pattern.  It is specific to this
    problem
     */
    @Override
    public void display() {
        System.out.println("Digital Display : " + temperature);
    }

    /*
    will be called from the subject when something changes
     */
    @Override
    public void update(double temp, double humidity, double pressure) {
        temperature = temp;

        // because we are a display element, we will have the display code in the
        // display method, which comes from the DisplayElement Interface, which has nothing to do
        // with the observer pattern
        display();
    }
}
