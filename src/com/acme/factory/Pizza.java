package com.acme.factory;
// abstract template for making pizza.  Factory Pattern
//since i am lazy and do not want to create the method in all classes
public abstract class Pizza {
    String name; //

    public void prepare(){
        System.out.println("Prepare : " + name);
    }

    public void bake() {
        System.out.println("Banke for 5 minutes at 350 degree celcius");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }
    // I can make these methods final if I do not want anyone to override it
    public void box() {
        System.out.println("Place pizza in an ecofriendly reusable box");
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "------" + name + "------";
    }
}
