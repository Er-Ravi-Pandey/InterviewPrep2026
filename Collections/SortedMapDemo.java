package com.DSA.Collections;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {


        SortedMap<Integer, String> map = new TreeMap<>((a,b) -> b-a);
        //SortedMap is an interface, TreeMap is a class, implements SortedMap
        //it implements comparable basis natural order
        //TreeMap implements comparator basis custom order
        //TreeMap internal implementation is Red-Black Tree which is self balancing binary search tree
       map.put(87,"Ravi");
       map.put(56,"Vijay");
       map.put(98,"Ajay");
        System.out.println(map);

        //sorted map holds more function than Map

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(87)); // this will print data before 87
        System.out.println(map.tailMap(56)); // this will print data after 56


        //Navigable Map extends Sorted Map
        //Navigable Map is an interface, TreeMap is a class, implements Navigable Map
        //Navigable Map internal implementation is Red-Black Tree which is self balancing binary search tree
        //providing more powerful navigation options such as finding the next or previous key or finding the key closest to a given value
        //retrieving the map in reverse order

        NavigableMap <Integer, String> map1 = new TreeMap<>();
        map1.put(87,"Ravi");
        map1.put(56,"Vijay");
        map1.put(98,"Ajay");
        System.out.println(map1.descendingMap());
        System.out.println(map1.ceilingEntry(56));
        System.out.println(map1.lowerKey(65));
        System.out.println(map1.higherEntry(56));




    }
}
