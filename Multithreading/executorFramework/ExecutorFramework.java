package com.DSA.Multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    //Executor Framework is a framework that provides a way to execute tasks asynchronously in a thread pool.
    //It was introduced in Java 1.5 and is part of the java.util.concurrent package.
    //To simplify the development of concurrent application by abstracting away the low level details of thread management.

    /*Manual thread management problems
    //Resource management
    //Scalability
    //Thread Reuse
    //Error Handling */



    //$ Important $
    //Runnable vs Callable
    //Runnable is used for tasks that don't return a value, it has a method name run() , Runnable has no throws exception
    //Callable is used for tasks that return a value , it has a method name call() , callable has throws exception



    //below submit method has runnable interface as parameter and also callable interface as return type
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println("Factorial of " + finalI + " is " + result);
            });
        }
        executor.shutdown(); //shutdown the thread pool
        executor.awaitTermination(100, java.util.concurrent.TimeUnit.SECONDS); //wait for the thread pool to terminate for 100 seconds
        System.out.println("TotalTime " + (System.currentTimeMillis() - startTime));
    }


    public static int factorial(int n) {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = n * i;
        }
        return result;
    }

}
