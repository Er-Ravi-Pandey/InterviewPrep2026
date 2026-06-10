package com.DSA.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.75f, true);
        //Subclass of HashMap
        //LinkedHashMap is used to maintain the order of insertion.
      //it has double linked list to maintain insertion order
        //so due to overhead of storing element in doubly linkedlist it is slower than HashMap
        //time complexity is O(1)

        //access order is by default false but when we mark it true it will maintain access order and put element at the last




        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);
        map.put("Egg", 50);
        map.put("Fig", 60);
        map.put("Grape", 70);
        map.put("Honey", 80);
        map.put("Ice", 90);
        map.put("Jelly", 100);

        map.get("Cherry"); // access order - Cherry, Apple, Banana, Date, Egg, Fig, Grape, Honey, Ice, Jelly
        //it used LRU algorithm (Least recently used algorithm)

        for(Map.Entry<String, Integer> entry: map.entrySet()) {

            System.out.println("LinkedHashMap"+entry.getKey() + " " + entry.getValue());
        }

        //caching mechanism this LRU is used for caching






        HashMap<String, Integer> map1 = new HashMap<>(); //hashmap doesn't maintain insertion order
        map1.put("Apple", 10);
        map1.put("Banana", 20);
        map1.put("Cherry", 30);
        map1.put("Date", 40);
        map1.put("Egg", 50);
        map1.put("Fig", 60);
        map1.put("Grape", 70);
        map1.put("Honey", 80);
        map1.put("Ice", 90);
        map1.put("Jelly", 100);


        LinkedHashMap linkedHashMap=new LinkedHashMap(map1);

        //some extra methods of Hashmap

        map1.putIfAbsent("Pomergranate", 100);
        map1.remove("Cherry");
        map1.replace("Egg", 50);
       System.out.println(map1.merge("Honey", 100, Integer::sum));



        for(Map.Entry<String, Integer> entry: map1.entrySet()){

            System.out.println("HashMap"+entry.getKey() + " " + entry.getValue());
        }

    }
}
