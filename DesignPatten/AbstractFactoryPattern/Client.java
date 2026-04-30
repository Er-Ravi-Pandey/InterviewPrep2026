package com.DSA.DesignPatten.AbstractFactoryPattern;

public class Client {

    //there is extra abstract layer after FactoryMethod where object is created different for each.
    public static void main(String[] args) {

        Employee e1= EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(e1.salary());

        Employee e2=EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(e2.salary());
    }
}
