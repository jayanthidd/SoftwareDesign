package com.acme.decorator.coffeehouse;
//this is our component class from which the base drinks will be extended
public abstract class Drink {
    protected String description = "Unknown Drink";

    public String getDescription() {
        return description;
    }

    public abstract double costs();
}
