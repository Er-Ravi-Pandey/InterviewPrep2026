package com.DSA.Strings;

import java.util.*;

    public class CityWithMaxRepeatedCharacters {

        public static String findCity(String[] cities) {
            String result = "";
            int maxRepeat = -1;

            for (String city : cities) {

                Map<Character, Integer> map = new HashMap<>();

                for (char ch : city.toLowerCase().toCharArray()) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }

                int repeatedCount = 0;

                for (int freq : map.values()) {
                    if (freq > 1) {
                        repeatedCount += (freq - 1);
                    }
                }

                if (repeatedCount > maxRepeat) {
                    maxRepeat = repeatedCount;
                    result = city;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String[] cities = {"Delhi", "Mumbai", "Chennai", "Pune", "Bangalore"};

            System.out.println(findCity(cities));
        }
    }

