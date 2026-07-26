package com.DSA.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapStreamQuestions {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        //count occurance of each character



      //  map.entrySet().stream().sorted(Comparator.comparing(e -> e.getValue())).forEach(System.out::println);

     //sort values using comparable
        map.entrySet().stream().sorted(Comparator.comparing(String::valueOf)).forEach(System.out::println);

        //sort values using comparator
        map.entrySet().stream().
                sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).
                forEach(System.out::println);

        //sort keys using comparable
        map.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey())).forEach(System.out::println);

        //sort keys using comparator
        map.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).forEach(System.out::println);


        String s="Amalgam";
        List<Character> list=new ArrayList<>();
        for(Character ch:s.toCharArray()){
            list.add(ch);
        }
        list.stream().map(x->Character.toLowerCase(x)).distinct().forEach(System.out::println);


        //count occurance of each character
        Map<Character, Long> wordCounts = list.stream()
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(wordCounts);



    }
}