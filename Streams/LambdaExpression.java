package com.DSA.Streams;

public class LambdaExpression  {

    public static void main(String[] args) {
        //Interface reference can be use to hold lambda expression
    Employee emp = () -> ("Hello");
    System.out.println(emp.getNames()); //Hello temp.getNames();
    }
}


@FunctionalInterface
interface Employee{
    String getNames();
}
