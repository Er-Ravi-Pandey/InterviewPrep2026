package com.DSA.Streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5};

       IntStream intStream = Arrays.stream(numbers);
        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));

    }
}
