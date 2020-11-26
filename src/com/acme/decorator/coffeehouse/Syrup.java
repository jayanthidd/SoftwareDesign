package com.acme.decorator.coffeehouse;

public class Syrup extends AdditionalDecorator {
    public Syrup(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Syrup";
    }

    @Override
    public double costs() {
        return drink.costs() + 0.90;
    }
}
