package com.DSA.Streams;


//Anonymous class is a nameless class created inline for immediate one-time implementation or method overriding.
interface Emp {
    public String getNames();
    public String getDesignation();
}
//Before Java 8 lambdas, if we wanted:
//
//quick implementation,
//temporary object,
//override method instantly,
//
//we used anonymous classes.


//🔥 Then Java 8 Came
//
//Lambda replaced many anonymous classes.

//Anonymous Class
//Runnable r = new Runnable() {
//    public void run() {
//        System.out.println("Run");
//    }
//};

//Lambda Version
//Runnable r = () -> System.out.println("Run");

//
class AnonymsInnerClass {
    public static void main(String[] args) {
        Emp emp=new Emp() {
            @Override
            public String getNames() {
                return "Ravi";
            }

            @Override
            public String getDesignation() {
                return "Developer";
            }
        };
        System.out.println(emp.getNames());
        System.out.println(emp.getDesignation());

        }
    }



