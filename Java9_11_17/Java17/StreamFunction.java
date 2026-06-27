package com.DSA.Java9_11_17.Java17;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFunction {

    public static void main(String[] args) {


        List<String> names = List.of("John", "Jane", "Jack", "Jill");

        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        collect.add("JAMES"); // This will work because the list returned by collect(Collectors.toList()) is modifiable.

        System.out.println(collect);


        //In java 16 and later, you can use the toList() method instead of collect(Collectors.toList()).

        List<String> list = names.stream().map(String::toUpperCase).toList();
        list.add("JAMES"); // This will throw an UnsupportedOperationException because the list returned by toList() is unmodifiable.

        System.out.println(list);


        /*Optional.isEmpty()

Before Java 11, you checked like this:

Optional<String> name = Optional.empty();

if (!name.isPresent()) {
    System.out.println("Empty");
}

The double negative:

!isPresent()

isn't very readable.

New API
if (name.isEmpty()) {
    System.out.println("Empty");
}

Much clearer.

Comparison

Old:

if (!optional.isPresent())

New:

if (optional.isEmpty())

Both mean the same thing.*/
    }
}