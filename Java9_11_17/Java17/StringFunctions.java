package com.DSA.Java9_11_17.Java17;

public class StringFunctions {

    public static void main(String[] args) {

        String s =" ";


        //old way
        if(s.trim().isEmpty()){
            System.out.println("String is blank");
        }

        //new way
        //It checks if the string is empty or contains only whitespace
        if(s.isBlank()){
            System.out.println("String is blank");
        }


        String m=" Hello World";

        m.strip(); //removes leading and trailing whitespace

        m.stripLeading(); //removes leading whitespace
        m.stripTrailing(); //removes trailing whitespace



    }
}
