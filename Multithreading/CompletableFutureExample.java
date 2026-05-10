package com.DSA.Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //CompletableFuture introduced in java 8 and is part of java.util.concurrent
        //It is used to handle asynchronous operations in a non-blocking way(meaning it doesn't block the main thread).

        //🔹 Simple understanding

        //“Task will complete in future”
        //
        //and:
        //
        //“when complete, do next action automatically”


        //🔥 2. Basic Example
        //CompletableFuture<Void> future =
        //        CompletableFuture.runAsync(() -> {
        //
        //            System.out.println("Task running");
        //        });
        //🔹 runAsync()
        //
        //Used when:
        //
        //no return value




        //🔥 3. supplyAsync()
        //
        //Used when:
        //
        //task returns value
        //Example
        //CompletableFuture<String> future =
        //        CompletableFuture.supplyAsync(() -> {
        //
        //            return "Hello";
        //        });



        //🔥 5. Real power → chaining
        //
        //This is MOST IMPORTANT.
        //
        //Example
        //CompletableFuture.supplyAsync(() -> "Ravi")
        //
        //        .thenApply(name -> name.toUpperCase())
        //
        //        .thenAccept(System.out::println);
        //🔹 Flow
        //Task1 → Task2 → Task3



        //🔥 6. Why important in microservices
        //
        //Suppose:
        //
        //Call User Service
        //Call Payment Service
        //Call Order Service
        //
        //Instead of sequential:
        //
        //2 sec + 2 sec + 2 sec = 6 sec
        //
        //Use CompletableFuture:
        //👉 parallel async calls
        //
        //≈ 2 sec total


        //🔥 10. Internal working
        //
        //By default uses:
        //
        //ForkJoinPool.commonPool()
        //
        //Thread pool internally.


        //Why better than normal threads
        //Thread	                        CompletableFuture
        //manual handling	                declarative
        //blocking	                        async
        //hard chaining	                    easy chaining
        //low-level	                        high-level


        //🔥 12. Interview use cases
        //parallel API calls
        //async microservices
        //notification systems
        //report generation
        //non-blocking backend tasks


        //“CompletableFuture enables asynchronous, non-blocking programming with callback chaining and task composition.”


        //“It is useful when multiple independent service calls can execute asynchronously,
        // such as dashboard aggregation, notification processing, or parallel microservice communication.”

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
