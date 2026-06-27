package com.DSA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        //forEach in order
        list.parallelStream().forEachOrdered(System.out::println);

        //Terminal Operations are used to perform final operation on stream and return the result
        //1.Collectors.toList()

        list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        //2.ForEach()
        list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

        //2.Count()
        System.out.println(list.stream().filter(x -> x % 2 == 0).count());

        //3.min()
        System.out.println(list.stream().min((a, b) -> a - b).get());

        //4.reduce
        System.out.println(list.stream().reduce(0, (a, b) -> a + b));


        //4.max()
        System.out.println(list.stream().max((a, b) -> a - b).get());

        //5.AllMatch , AnyMatch , NoneMatch
        boolean b = list.stream().allMatch(x -> x % 2 == 0);
        list.stream().anyMatch(x -> x > 0);
        list.stream().noneMatch(x -> x < 0);


        //6.findFirst() , findAny()
        list.stream().findFirst().get();
        list.stream().findAny().get();


        //Example : Filtering and collecting names
        List<String> names = Arrays.asList("Ravi", "Saurabh", "Advait", "Shivangi");
        System.out.println(names.stream().filter(x -> x.length() > 4).collect(Collectors.toList()));

        //Example : Squaring and sort numbers
        System.out.println(list.stream().map(x -> x * x).sorted().collect(Collectors.toList()));

        //10. Filtering and collecting names
        List<String> nme = Arrays.asList("Anna", "Bob", "the", "builder");
        System.out.println(nme.stream().filter(x -> x.length() > 3).toList());

        //11.Squaring and Sorting Numbers
        List<Integer> num = Arrays.asList(1, 3, 5, 6, 78, 9);
        System.out.println(num.stream().map(x -> x * x).sorted().toList());


        //Example : Sum of numbers
        System.out.println(list.stream().reduce(0, (a, c) -> a + c));

        //Exmaple : Counting occurences of characters in a string
        String str = "aaaabbbbcccddddeeeeffffgggggghhhhhhhhh";
        //this will automatically compare characters using ASCII value.
        char c='c';
        System.out.println(str.chars().filter(x -> x == c).count());

        //stateless & stateful

        //Stream ends with terminal operation and can't be consumed again


    }
}
