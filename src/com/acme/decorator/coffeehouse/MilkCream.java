package com.acme.decorator.coffeehouse;

public class MilkCream extends AdditionalDecorator {
    public MilkCream(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Milkcream";
    }

    @Override
    public double costs() {
        return drink.costs() + 0.60;
    }
}
