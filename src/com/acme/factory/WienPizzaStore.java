package com.acme.factory;

public class WienPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("veggie"))
            return new WienVeggiePizza();
        else if (item.equals("mushroom"))
            return new WienMushroomPizza();
        return null;
    }
}
