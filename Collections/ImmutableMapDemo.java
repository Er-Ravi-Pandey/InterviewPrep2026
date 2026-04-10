package com.DSA.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // Immutable Map

        Map<String,Integer> map1=new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

       Map<String, Integer> map2 =Collections.unmodifiableMap(map1);
       //this map2 won't allow any modification of map1
        System.out.println(map2);
        //map2.put("D", 4); //throws UnsupportedOperationException
        //but there is a catch like what if map1 is modified?
        //then map2 will also be modified


        //so in Java 9 this feature was introduced Map.of
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3); // JDK 16>
        //Map.Of has a limit of 10 elements key value entry

        //so to have multiple entries we have Map.ofEntries


        Map<String, Integer> map3 = Map.ofEntries(Map.entry("A", 1), Map.entry("B", 2), Map.entry("C", 3));

        System.out.println(map3.put("E",8)); //throws unsupportedOperationException
        /*Immutable HashMaps have several purposes in the real world:

Thread Safety: Immutable HashMaps are thread-safe, meaning that multiple threads can access and read from the map without fear of it being modified concurrently. This makes them ideal for use in multi-threaded environments.
Data Integrity: Immutable HashMaps ensure that the data stored in the map remains consistent and unchanged. This is particularly important in applications where data integrity is critical, such as in financial or medical systems.
Caching: Immutable HashMaps can be used as a cache, where the data is computed once and then stored in the map. Since the map is immutable, the cached data will not change, and subsequent requests can be served directly from the cache.
Configuration Management: Immutable HashMaps can be used to store configuration data that should not be changed once it's set. This ensures that the configuration remains consistent throughout the application.
Event Sourcing: Immutable HashMaps can be used to store event data in event-sourced systems. Since the map is immutable, the event history remains unchanged, and new events can be appended to the map without modifying existing events.
Data Serialization: Immutable HashMaps can be easily serialized and deserialized, making them a good choice for storing data that needs to be transmitted or stored.
Code Simplification: Immutable HashMaps can simplify code by eliminating the need for defensive copying or synchronization. This can make the code easier to read and maintain.
Real-world examples of Immutable HashMaps include:

Google's Guava library: Guava provides an immutable map implementation that is widely used in the industry.
Java 8's Map.of(): Java 8 introduced a new way to create immutable maps using the Map.of() method.
Apache Commons' ImmutableMap: Apache Commons provides an immutable map implementation that is widely used in the industry.
Amazon's DynamoDB: DynamoDB uses immutable maps to store data in its NoSQL database.
Some examples of companies that use Immutable HashMaps include:

Google: Google uses Immutable HashMaps extensively in its Guava library and other internal projects.
Amazon: Amazon uses Immutable HashMaps in its DynamoDB database and other internal projects.
Netflix: Netflix uses Immutable HashMaps in its internal projects, including its caching layer.
LinkedIn: LinkedIn uses Immutable HashMaps in its internal projects, including its data storage layer.*/


    }
}
