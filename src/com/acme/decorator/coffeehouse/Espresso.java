package com.acme.decorator.coffeehouse;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double costs() {
        return 1.90;
    }
}
