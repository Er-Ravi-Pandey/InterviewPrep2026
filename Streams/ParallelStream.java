package com.DSA.Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        //A type of stream that enables parallel processing of elements
        //Allowing multiple threads to work on different elements of the stream at the same time
        //this improves performance for large data sets
        //workload is distributed among multiple threads
        //Parallel streams divide the change into substreams and process them in parallel threads
        long startTime=System.currentTimeMillis();
        List<Integer> list= Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> factorial=list.stream().map(ParallelStream::factorial).toList();
        long endTime=System.currentTimeMillis();

        System.out.println("Time Taken in sequential streams "+(endTime-startTime));


       startTime=System.currentTimeMillis();

       factorial=list.parallelStream().map(ParallelStream::factorial).toList();
        endTime=System.currentTimeMillis();
        System.out.println("Time Taken in parallel streams "+(endTime-startTime));

        //Note : Parallel Stream is only required when large dataset ans independent operation like in
        //factorial where value is independent






    }

    private static long factorial(int n) {
        long result=1;
        for(int i=2;i<=n;i++){
         result*=i;
        }
        return result;
    }
}
