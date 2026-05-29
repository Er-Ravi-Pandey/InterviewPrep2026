package com.DSA.Streams;



//Default method
//Java 8 allowed:
//
//method implementation inside interface using default


//Example
//interface Vehicle {
//
//    void start();
//
//    default void stop() {
//        System.out.println("Vehicle stopped");
//    }
//}
//🔥 Now Implementing Class
//class Car implements Vehicle {
//
//    public void start() {
//        System.out.println("Car started");
//    }
//}
//
//No need to implement:
//
//stop()
//
//because default implementation already exists.




//🔥 Why Introduced?
//
//Mainly:
//
//backward compatibility
//
//So Java team could add new methods to interfaces
//without breaking old code.
//
//🔥 Real-world Example
//
//Very famous example:
//
//Collection interface
//
//Java 8 added:
//
//stream()
//forEach()
//
//using default methods.
//
//Otherwise:
//
//millions of existing classes would've broken



//🔥 Can Class Override Default Method?
//
//YES.
//
//@Override
//public void stop() {
//    System.out.println("Custom stop");
//}



//Default methods allow interfaces to have method implementations without breaking existing implementing classes.
interface A{
    default void show(){
        System.out.println("Default method is called from interface A");
    }
    static void display(){
        System.out.println("Static method is called from interface A");
    }
}
interface B {
    default void show() {
        System.out.println("Default method is called from interface B");
    }
}

//Below is the diamond problem = Overiding the method is the soln.
//Diamond problem occurs when a class inherits same method from multiple sources causing ambiguity.
// Java avoids it in classes by not supporting multiple inheritance,
// but with Java 8 default methods ambiguity can still occur between interfaces and must be resolved by overriding.
//Diamond problem in Java became relevant mainly after default methods were introduced in interfaces in Java 8.
public class DefaultMethod implements A,B{
    public static void main(String[] args) {
        DefaultMethod b = new DefaultMethod();
        b.show();

       //Static method in interface can be called using interface name only.
        //Static method can't be overridden
        A.display();
    }



    //To avoid ambiguity
    @Override
    public void show() {
        A.super.show();
    }
}

