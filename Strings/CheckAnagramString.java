package com.DSA.Strings;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagramString {

    public boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        CheckAnagramString checkAnagramString = new CheckAnagramString();
        System.out.println(checkAnagramString.checkAnagram("ravi", "ravii"));
    }


}
