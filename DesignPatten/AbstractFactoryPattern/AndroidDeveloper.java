package com.DSA.DesignPatten.AbstractFactoryPattern;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {

        return "Android Developer";
    }
}
