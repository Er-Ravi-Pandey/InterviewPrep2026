package com.DSA.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //collectors is a utility class which is used to collect data from stream


        //1.Collecting to a List
        List<String> names= Arrays.asList("Ravi","Saurabh");
        List<String> list= names.stream().filter(x->x .startsWith("R")).collect(Collectors.toList());
        System.out.println(list);

        //2.Collecting to a Set
        List<String> names1= Arrays.asList("Ravi","Saurabh","Ravi","Saurabh");
        Set<String> list1= names1.stream().collect(Collectors.toSet());
        System.out.println(list1);

        //3.Collecting to specified collection
        //can be converted to any collection
        TreeSet<String> collect = names.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));

        //4.Joining Strings
        String collect1 = names1.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println( collect1);


        //5.Summarising Data
        //General Statistics summary (count,sum,min,average,max)
        List<Integer> list2=Arrays.asList(5,5,7,8,9);
        IntSummaryStatistics stats = list2.stream().collect(Collectors.summarizingInt(x ->x));
        System.out.println("count" + stats.getCount() + "sum" + stats.getSum() + "min" + stats.getMin() + "average" + stats.getAverage() + "max" + stats.getMax());

        //6.Averaging
        double average = list2.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(average);

        //7.Counts
        Map<Integer,Long> collect2 = list2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect2);

        //8.Imp-Grouping elements -it groups each elemennt by length

        List<String> words=Arrays.asList("Ravi","Sau","Ravi","Saurabh");

        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));

        //also we can join
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(","))));

        //9.Partitioning elements -it divides elements into two groups based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x->x.length()>5)));

        //10.Mapping and collecting
        System.out.println(words.stream().collect(Collectors.mapping(String::length,Collectors.toList())));



        //some important question
     //Convert List to Map bases the value of character count
     List<String> fruits=Arrays.asList("Apple","Banana", "Guava");
     System.out.println(fruits.stream().collect(Collectors.toMap(x->x,x->x.length())));



    }
}
