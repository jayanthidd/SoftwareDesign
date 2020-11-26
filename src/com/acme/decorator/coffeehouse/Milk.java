package com.acme.decorator.coffeehouse;
// this extends the decorator class and allows any milk to have milk added to it.
// all drinks are accessible here and milk can be added on
public class Milk extends AdditionalDecorator {
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }

    @Override
    public double costs() {
        return drink.costs() + 0.40;
    }
}
