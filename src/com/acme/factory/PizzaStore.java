package com.acme.factory;
// manages a complete Pizza Store and has many other methods that
// we do not see here
public abstract class PizzaStore {
    //factory method
    protected abstract Pizza createPizza(String item);

    //one of the many methods in this class
    public Pizza orderPizza(String type){
        //here we will call the factory method
        Pizza pizza = createPizza(type);

        if(pizza!=null){
            System.out.println("----Making a " + pizza.getName() + "----");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}
