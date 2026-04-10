package com.DSA.Collections;

import java.util.Vector;

public class VectorCollection {


//    A vector in java is a part of java.util package and is one of the legacy
//            classes in Java that implements the list interface
//    It was introduced in JDK1.0 before collection framework and is synchronised , making it thread safe.
//
//    however, due to its sync. overhead , it is recommended to use other modern alternatives like ArrayList in
//    single threaded scenerios.Despite this , vector is still useful in certain situation , particularly in multithreaded env
//            where thread safety concern
//
//    Dynamic Array - Like ArrayList , vector is a dynamic array that grows automatically
//    when more elements are added than its current capacity
//
//      Synchronised - All the method in vector are sync , which makes it thread safe

//
//    capacity is 10 in vector same as ArrayList but it increases by 2 times unlike ArrayList which increase by 1.5

    public static void main(String[] args) {
        //perform multithreaded operation on vector

        Vector<Integer> vector = new Vector<>();

        vector.add(2);

        vector.add(3);
        vector.add(1);
        vector.add(1);
        System.out.println(vector);


    }
}
