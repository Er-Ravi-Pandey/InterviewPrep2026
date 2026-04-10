package com.DSA.Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeastingCharacter {
    public static void main(String[] args) {

            firstNonRepeating("raviJIravi");


    }

    private static void firstNonRepeating(String str) {
        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(Character c : chars){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


            for(Character c : chars){
                if(map.get(c) == 1){
                    System.out.println("First non repeating character is "+ c);
                    return;
                }
            }
            System.out.println("No non repeating character found");
    }
}