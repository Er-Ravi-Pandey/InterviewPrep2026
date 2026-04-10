package com.DSA.Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //CompletableFuture introduced in java 8 and is part of java.util.concurrent
        //It is used to handle asynchronous operations in a non-blocking way(meaning it doesn't block the main thread).


        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {            //supplyAsync() method is used to execute a task in a separate thread and return a CompletableFuture that represents the result of the task.
            try {
                Thread.sleep(2000);
                System.out.println("Worked Thread");
            } catch (InterruptedException e) {

            }
            return "Mai choota tha phir bhai ne bada kia hai";

        }).thenApply(s -> s.toUpperCase());


        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> {            //supplyAsync() method is used to execute a task in a separate thread and return a CompletableFuture that represents the result of the task.
            try {
                Thread.sleep(2000);
                System.out.println("Worked Thread2");
            } catch (InterruptedException e) {

            }
            return "ok";

        });


        CompletableFuture.allOf(completableFuture,completableFuture1).join();

        String s=null;
        try {
            s = completableFuture.get();
            System.out.println(s);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);            //get() method is used to retrieve the result of the task.
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Main Thread");

    }
}
