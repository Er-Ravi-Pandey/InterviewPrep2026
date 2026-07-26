package com.DSA.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        System.out.println("Set Overview");
        //set is a collection that cannot contain duplicate elements
        //set is based on the internal working of hashmap
        //set does not allow null values


        //faster operation
        //Map - HashMap , LinkedHashMap, TreeMap, EnumMap
        //Set - HashSet, LinkedHashSet, TreeSet, EnumSet
        //it has all methods as of Map type ,just we do add instead of put as it extends collection



        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(10);
        System.out.println(set);

        //for ordered Set use LinkedHashSet
        //for sorted Set use TreeSet
        //EnumSet


        //for thread Safety use ConcurrentLinkedHashSet

        Set<Integer> set2=new ConcurrentSkipListSet<>();

        //unmodifiable

        Set<Integer> set3 = Set.of(1,2,3,4,5);
     //   System.out.println(set3.add(6)); //throws UnsupportedOperationException since this has become immutableCollection



    }
}