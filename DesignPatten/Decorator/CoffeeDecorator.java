package com.DSA.DesignPatten.Decorator;


//Notice it implements the same interface and contains the wrapped object.
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
