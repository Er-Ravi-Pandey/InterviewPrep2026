package com.DSA.Multithreading.executorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(9);
        Future<?> future = executor.submit(() -> 1 + 2);
        Integer result = (Integer) future.get();
        System.out.println(result);
        executor.shutdown();
        Thread.sleep(1000);

        System.out.println(executor.isTerminated());

        //Future methods

       /* future.get()
                future.isDone()
                future.isCancelled()
                future.cancel(true)
                future.get(1, TimeUnit.SECONDS)
                */
    }

}
