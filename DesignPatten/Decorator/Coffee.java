package com.DSA.DesignPatten.Decorator;


//Decorator Design Pattern is a structural design pattern used when you want to add new behavior
// to an object dynamically without modifying its existing code.


//Think of it as wrapping an object inside another object that adds extra functionality.
public interface Coffee {
    String getDescription();
    double getCost();
}
