package com.DSA.Streams;


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

