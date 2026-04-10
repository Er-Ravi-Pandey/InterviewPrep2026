package com.DSA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //feature introduced in java8
        //process collection of data in a  functional and declarative manner
        //Simplify Data Programming


        //what is stream ?
        //a sequence of operation which supports declarative and functional programming

        //How to use Streams?
        //Source , intermediate operations & terminal operation

        List<Integer> numbers = Arrays.asList(1,2,3,45,6,7,78);

        //even count

        System.out.println(numbers.stream().filter(x->x%2==0).count());

        //creating Streams
        //1. From Collections
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream=list.stream();

        //2.From Arrays

        String [] arrays={"a","b","c"};
        Stream<String> stream1=Arrays.stream(arrays);

        //3.Using Stream.Of()
        Stream<String> stream2=Stream.of("rr","ffr");

        //4.Infinite Streams
        Stream<Integer> stream3=Stream.generate(() -> 1);

        List<Integer> stream4=Stream.iterate(1, x->x+1).limit(50).collect(Collectors.toList());

        System.out.println(stream4);
    }
}
