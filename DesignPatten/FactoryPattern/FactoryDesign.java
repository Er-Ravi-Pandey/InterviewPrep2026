package com.DSA.DesignPatten.FactoryPattern;

import java.util.HashMap;
import java.util.Map;

public class FactoryDesign {
    //when there is a superclass and multiple subclass and we want to get object of subclass based on input and requirement

    //then we create a Factory class which takes responsibilty of creating object of class based on input

    //Advantage -
    //Focus on creating object for interface than implementation
    //Loose coupling, more robust code

    //this also implement D of SOLID principle

    public static Employee getEmployeeSalary(String type) {

        if (type.trim().equalsIgnoreCase("SOFTWARE_DEVELOPER")) {
            return new SoftwareDeveloper();
        } else if (type.trim().equalsIgnoreCase("AI_DEVELOPER")) {
            return new AiDeveloper();
        } else {
            return null;
        }


        //to Avoid if-else


    }


}
