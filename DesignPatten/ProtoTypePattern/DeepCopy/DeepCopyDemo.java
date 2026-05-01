package com.DSA.DesignPatten.ProtoTypePattern.DeepCopy;


//Shallow Copy ❌
//p1 ----\
//        --> Address (same)
//p2 ----/


//Deep Copy ✔
//p1 ----> Address A
//p2 ----> Address B


//“Deep copy is used when we need complete isolation between objects, especially in multithreading
//caching, API layer transformations, and undo/redo systems, to avoid unintended side effects caused by shared references.
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Deep copy method

    Address(Address other) {
        this.city = other.city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor
    Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address); // 👈 IMPORTANT
    }
}

public class DeepCopyDemo {

    public static void main(String[] args) {

        Address addr = new Address("Delhi");

        Person p1 = new Person("Ravi", addr);

        // Deep copy
        Person p2 = new Person(p1);

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

