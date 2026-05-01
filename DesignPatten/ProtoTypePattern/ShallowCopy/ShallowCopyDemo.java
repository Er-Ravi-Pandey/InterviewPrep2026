package com.DSA.DesignPatten.ProtoTypePattern.ShallowCopy;

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 👈 SHALLOW COPY
    }
}

//Type	Behavior
//Shallow Copy	references shared
//Deep Copy	completely independent objects

//“Shallow copy creates a new object but copies references of nested objects, so changes in one object can affect the other.”
//Shallow copy = new object, same references

public class ShallowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address addr = new Address("Delhi");

        Person p1 = new Person("Ravi", addr);

        // Shallow copy
        Person p2 = (Person) p1.clone();

        // Modify copied object
        p2.name = "Amit";
        p2.address.city = "Noida";

        // Print results
        System.out.println("Original Person:");
        System.out.println(p1.name + " - " + p1.address.city);

        System.out.println("Cloned Person:");
        System.out.println(p2.name + " - " + p2.address.city);
    }
}