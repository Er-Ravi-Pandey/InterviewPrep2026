package com.DSA.Collections;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put("A", 1);
        ht.put("B", 2);
        ht.put("C", 3);
        //Hashtable was introduced in JDK 1
        //Hashtable is synchronized
        //Hashtable is thread safe
        //Hashtable is serializable
        //legacy class in java which is replaced by ConcurrentHashMap
        //slower than HashMap
        //+Imp+
        //In hashtable keys and values can't be null
        //Only linkedList in case of collision
        //All methods are synchronized



    }
}
