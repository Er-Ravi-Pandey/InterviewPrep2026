package com.DSA.DesignPatten.Decorator;

public class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 100.0; // Base cost of basic coffee
    }
}
