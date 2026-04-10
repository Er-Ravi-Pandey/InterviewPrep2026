package com.DSA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {
        //Intermediate operations transform a stream into another stream
        //they are lazy, meaning they don't execute until a terminal operation is invoked

        //1.filter (Predicate Interface)
        List<String> list= Arrays.asList("Ramu","Ravi","Saurabh","Shivangi","Advait","Ravi","Ramesh");

        long res=list.stream().filter(x-> x.startsWith("R")).count();
        System.out.println(res);

        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list2.stream().filter(x-> x%2==0).collect(Collectors.toList()));


        //2.Map (Functional Interface)
        System.out.println(list.stream().map(x-> x.toUpperCase()).collect(Collectors.toList()));
        System.out.println(list2.stream().filter(x-> x%2==0).map(x-> x*x).collect(Collectors.toList()));

        //3.Sorted(Comparator Interface)
        Stream<String> sorted=list.stream().sorted();
        List<String> comparatorSorted=list.stream().sorted((a,b)-> b.length() - a.length()).collect(Collectors.toList());
        System.out.println(comparatorSorted);

        //4.distinct (Unique elements)
        System.out.println(list.stream().filter(x-> x.startsWith("R")).distinct().collect(Collectors.toList()));

        //5.limit
        System.out.println(Stream.iterate(1, x->x+4).limit(5).collect(Collectors.toList()));

        System.out.println(list2.stream().filter(x-> x%2==0).map(x-> x*x).sorted((a,b)-> b-a).limit(4).collect(Collectors.toList()));


        //6.Skip
        System.out.println(Stream.iterate(1, x->x+4).skip(5).limit(5).collect(Collectors.toList()));

        //7.peek
        System.out.println("Peeking");
        System.out.println(Stream.iterate(1, x->x+4).skip(5).limit(5).peek(x-> System.out.println(x)).collect(Collectors.toList()));



        //8. toArray
        Object [] arr=  Stream.of(1,2,3,4,5).toArray();

        //9.Min
        Stream.of(1,2,3,4,5).min((a,b)->a-b).ifPresent(System.out::println);


        //FlatMap - every individual element is itself a list
        //Flatten nested structure (list within list) so that they can be processed as a single sequence of elements
        //Transform and flatten elements at the same time.



        List<List<String>> listOfLists= Arrays.asList(
                Arrays.asList("A","B","C"),
                Arrays.asList("D","E","F"),
                Arrays.asList("G","H","I"));
        System.out.println(listOfLists.stream().flatMap(x->x.stream()).map(String::toLowerCase).collect(Collectors.toList()));
       //first it flatten and then trasnform

        List<String> n=Arrays.asList("Helloworld","Java","Developer");

       n.stream().flatMap(x-> Arrays.stream(x.split(""))).map(String::toUpperCase).forEach(System.out::print);





    }
}
