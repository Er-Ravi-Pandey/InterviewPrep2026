package com.DSA.Collections;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        String key1=new String("Keys");
        String key2=new String("Keys");

        Map<String, Integer> map=new HashMap<>();
        map.put(key1, 10);
        map.put(key2, 20);

        System.out.println(map); //it prints Keys=20 because here hashcode comparison is done on class object
        //hashmap update the value of key1 to 20


        Map<String, Integer> map2=new IdentityHashMap<>();
        map2.put(key1, 10);
        map2.put(key2, 20);
       //here in IdentityHashMap it will not update the value of key1 to 20 b
        //string objects are compared not class
        System.out.println(map2);


        //this is in identityHashMap
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        //this is in hashmap
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

    }
}
