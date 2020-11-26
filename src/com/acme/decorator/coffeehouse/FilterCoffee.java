package com.acme.decorator.coffeehouse;

public class FilterCoffee extends Drink{

    public FilterCoffee() {
        description = "Filter Coffee";
    }

    @Override
    public double costs() {
        return 1.0;
    }
}
