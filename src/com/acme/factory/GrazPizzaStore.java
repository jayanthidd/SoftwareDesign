package com.acme.factory;

public class GrazPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("mushroom"))
            return new GrazMushroomPizza();
        else if (item.equals("cardinale"))
            return new GrazCardinalePizza();
        return null;
    }
}
