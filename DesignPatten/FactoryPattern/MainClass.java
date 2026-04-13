package com.DSA.DesignPatten.FactoryPattern;

public class MainClass {
    public static void main(String[] args) {
     Employee employee=FactoryDesign.getEmployeeSalary("SOFTWARE_DEVELOPER");
     System.out.println(employee.salary());


     Employee employee2=FactoryDesign.getEmployeeSalary("AI_DEVELOPER");
     System.out.println(employee2.salary());
    }

}
