package com.DSA.Collections;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {





        //“ConcurrentSkipListMap is a thread-safe sorted map implementation based on skip list data structure.
        // It allows concurrent access while maintaining natural ordering of keys.”

        //👉 In Java, you’ll see:
        //
        //ConcurrentSkipListMap
        //ConcurrentSkipListSet


        //🔹 Why not just use ConcurrentHashMap?
        //ConcurrentHashMap → fast, but NO ordering
        //ConcurrentSkipListMap → maintains sorted order
        //
        //👉 It is a thread-safe + sorted collection
        //it is a concurrent version of TreeMap
        //helps in getting sorted map in multi-threaded environment
        //it holds data in skip list data structure
        //it used for multi-threaded environment
        //Skip list - > probability based data structure that allows for efficient insertions and deletions
        //it is similar to a sorted linked list but with the mulitple layers that "skip" over portion
        // of the list to provide fast access to elements


        //it stores element in levels
        //level 3 - 1___6__9
        // level 2 - 1_4_6_8_9
        // Level 1 -1,2,4,5,6,7,8,9

        //with this approach , we can get better performance in multi-threaded environment



            ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

            map.put(3, "Ravi");
            map.put(1, "Ajay");
            map.put(2, "Vijay");

            System.out.println(map);
        }

    }

