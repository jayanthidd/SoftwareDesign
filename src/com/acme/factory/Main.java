package com.acme.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore gStore = new GrazPizzaStore();
        PizzaStore wStore = new WienPizzaStore();

        Pizza pizza = gStore.orderPizza("cardinale");
        System.out.println(pizza);

        Pizza pizza2 = wStore.orderPizza("mushroom");
        System.out.println(pizza2);
    }
}
