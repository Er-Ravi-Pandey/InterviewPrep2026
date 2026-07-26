package com.DSA.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterBasisFrequency {


        public String frequencySort(String s) {

            char[] items= s.toCharArray();

            Map<Character,Integer> map=new HashMap<>();

            for (Character item : items) {

                map.put(item, map.getOrDefault(item, 0) + 1);
            }

            List<Character> list = new ArrayList<>(map.keySet());
            list.sort((a, b) -> map.get(b) - map.get(a)); // Step 2: Sort

            StringBuilder sb = new StringBuilder(); // Step 3: Build
            for (char c : list) {
                for (int i = 0; i < map.get(c); i++) sb.append(c);
            }
            return sb.toString();

        }





    public static void main(String[] args) {


        SortCharacterBasisFrequency sortCharacterBasisFrequency=new SortCharacterBasisFrequency();
        System.out.println(sortCharacterBasisFrequency.frequencySort("cccaabbbbbbba"));
    }
    }

