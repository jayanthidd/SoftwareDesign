package com.acme.decorator.coffeehouse;

public class Demo {
    public static void main(String[] args) {
        //Espresso with milk.  First we make the basic espresso
        Drink espresso = new Espresso();
        //then we (add) the milk to it
        espresso = new Milk(espresso);
        System.out.println(espresso.getDescription() + " : " + espresso.costs());
        System.out.println("-----------------");

        //Filtercoffee with milk cream and syrup.  First make the base drink
        Drink filter = new FilterCoffee();
        //then add milkcream
        filter = new MilkCream(filter);
        //then add the syrup
        filter = new Syrup(filter);
        System.out.println(filter.getDescription() + " : " + filter.costs());

    }
}
