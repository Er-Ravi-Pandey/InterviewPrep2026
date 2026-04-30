package com.DSA.Collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) throws InterruptedException {




//        It’s a thread-safe version of HashMap introduced in Java 1.5.
//
//        Belongs to the java.util.concurrent package.
//
//        Allows multiple threads to read and update the map without locking the entire map.
//
//        Unlike Hashtable (which locks the whole map), ConcurrentHashMap locks only part of the map (buckets/segments)
//        → so performance is much better.
//
//
//
//
// ConcurrentHashMap extends concurrentMap and Serializable
        //Java7 --> segment based locking --> 16 segments --> smaller hashmaps
        //only the segment being written to or read from is locked
        //read: do not require locking unless there is a write ops happening on the same segment
        //write: lock

        //Java8--> no segmentation
        //           --> (CAS) compare and swap approach --> no locking except resizing or collision
        //This means multiple threads can update different parts of the map at the same time.
        //Thread A last saw --> x =45
        //Thread A work --> x to 50
        //if x is still 45 , then swap x to 50 else dont change and retry
        //put -> index

//        Thread-safety without global locking
//
//        Multiple threads can read/write simultaneously.
//
//        Atomic operations (no extra synchronization needed):
//
//        putIfAbsent(key, value)
//
//        remove(key, value)
//
//        replace(key, oldValue, newValue)
//        replace(key, oldValue, newValue)
//
//        compute(), computeIfAbsent(), computeIfPresent()
//
//        Fail-safe iterator
//
//        Iterators don’t throw ConcurrentModificationException.
//
//                They reflect changes made during iteration (weakly consistent).



        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                map.put(i, Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map);
    }
}


