package com.DSA.Streams;

import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,3, 2,4,4,2);
        list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);



    }
}
