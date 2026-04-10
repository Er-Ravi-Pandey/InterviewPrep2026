package com.DSA.Multithreading.executorFramework;


import java.util.concurrent.Executors;

//ScheduledExecutorService is a thread pool that is used to schedule tasks to be executed at a specific time in the future.
public class ScheduledExecutorService {
    public static void main(String[] args) {


        //executor service
        //scheduled executor service
        //delayed executor service


        java.util.concurrent.ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        //  scheduler.schedule(() -> System.out.println("Task has been delayed for 5 seconds"), 5, java.util.concurrent.TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> System.out.println("Task will be executed every 5 seconds"), 5, 5, java.util.concurrent.TimeUnit.SECONDS);

        //schedule with fixed delay
        scheduler.scheduleWithFixedDelay(() -> System.out.println("Task will be executed every 5 seconds with fixed delay"), 5, 5, java.util.concurrent.TimeUnit.SECONDS);

//this will schedule to shutdown after sometimes
        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown");
            scheduler.shutdown();
        }, 20, java.util.concurrent.TimeUnit.SECONDS);

    }
}