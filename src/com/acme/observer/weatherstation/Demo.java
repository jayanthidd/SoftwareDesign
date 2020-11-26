package com.acme.observer.weatherstation;

public class Demo {
    public static void main(String[] args) {
        WetterStation ws = new WetterStation();

        DigitalDisplay digitalDisplay = new DigitalDisplay(ws);
        ws.setMeasurements(20,65,1000);

        System.out.println("--------------");

        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(ws);
        ws.setMeasurements(20.3,54,999);


    }
}
