package com.acme.decorator.coffeehouse;
//decorator class ,also known as a wrapper class.  This extends our component class
public abstract class AdditionalDecorator extends Drink{
    //every decorator decorates an object, so we need an instance of the object to decorate
    protected Drink drink;

    public AdditionalDecorator(Drink drink) {
        this.drink = drink;
    }

    // forces all the classes deriving from here to override
    //this method since we know that the implementation in Drink
    // for this situation is not suitable.  This drink consists of atleast
    // 2 parts - the original drink and atleast one additional ingredient
    public abstract String getDescription();
}
