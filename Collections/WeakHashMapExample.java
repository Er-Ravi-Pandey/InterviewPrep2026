package com.DSA.Collections;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // Create a WeakHashMap
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();

        //Weak hashmap is a map implementation that uses weak references for its keys.
        //This means that if a key is no longer referenced elsewhere in the program, it can be garbage collected, and the corresponding entry in the map will be removed automatically.
        // This is useful for memory-sensitive applications where you want to allow keys to be garbage collected when they are no longer needed.
        // Add some entries to the map
        String key1 = new String("key1");
        String value1 = new String("value1");
        weakMap.put(key1, value1);

        String key2 = new String("key2");
        String value2 = new String("value2");
        weakMap.put(key2, value2);

        // Print the contents of the map
        System.out.println("Initial map contents:");
        for (String key : weakMap.keySet()) {
            System.out.println(key + ": " + weakMap.get(key));
        }

        // Remove the strong reference to key1
        key1 = null;

        // Force garbage collection
        System.gc();

        // Print the contents of the map again
        System.out.println("Map contents after GC:");
        for (String key : weakMap.keySet()) {
            System.out.println(key + ": " + weakMap.get(key));
        }
    }
}