package com.DSA.DesignPatten.AbstractFactoryPattern;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        return 856550;
    }

    @Override
    public String name() {
        return "Web Developer";
    }
}
