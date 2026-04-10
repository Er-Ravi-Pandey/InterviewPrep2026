package com.DSA.Strings;

import java.io.StringWriter;

public class StringBasics {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Ravi";

       str1= str1.concat(str2); //with string literals we can use concat method to concatenate
        // two strings but it will not change the original string as string is immutable in java it will create a new string and
        // assign it to str1 and create new object in memory and str1 will point to that new object and original string will be garbage collected by java

        System.out.println(str1);


        //Here , with StringBuilder things are mutable hence no need to give reference.
       StringBuilder str5=new StringBuilder("Hello");
       str5.append(" World");
       System.out.println(str5);


       StringBuffer str6=new StringBuffer("Hello");
       str6.append(" World");

       System.out.println(str6);




    }
}
