package com.DSA.Multithreading.executorFramework;


import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

//this will schedule to shut down after sometimes
        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown");
            scheduler.shutdown();
        }, 20, java.util.concurrent.TimeUnit.SECONDS);


        //Good answer:
        //
        //“Schedulers use managed thread pools, improve resource utilization, \
        // support delayed/periodic execution, and avoid manual thread lifecycle handling
    }
}

//Is scheduler in executor framework of multithreading used in scheduling task in springboot n microservices
//Yes 👍
//The concept is closely related.
//
//In real-world backend systems like Spring Boot microservices, task scheduling is very common, and internally it relies on:
//
//threads,
//thread pools,
//and scheduler mechanisms from Java concurrency.
//🔥 Connection Between Executor Framework & Spring Scheduling
//
//In core Java:
//
//ScheduledExecutorService
//
//is used for:
//
//delayed tasks,
//periodic tasks,
//repeated background execution.
//
//Example:
//
//send notification every 5 mins
//cleanup cache every hour
//retry failed jobs
//🔥 In Spring Boot
//
//Spring provides easier abstraction using:
//
//@Scheduled
//
//Example:
//
//@Scheduled(fixedRate = 5000)
//public void runTask() {
//
//    System.out.println("Running every 5 seconds");
//}
//🔥 But internally?
//
//Spring uses:
//
//scheduler threads,
//task executors,
//thread pools,
//
//which are conceptually built on Java concurrency APIs like:
//
//ExecutorService
//ScheduledExecutorService
//ThreadPoolExecutor
//🔥 Real-world Microservice Use Cases
//
//Very common.
//
//🔹 1. Retry Failed Events
//
//Example:
//
//payment service retry
//Kafka message retry
//email resend
//🔹 2. Cleanup Jobs
//
//Example:
//
//delete expired OTPs
//clear temp files
//purge logs
//🔹 3. Notification Services
//
//Example:
//
//send reminder every morning
//scheduled reports
//monthly statements
//🔹 4. Polling External APIs
//
//Example:
//
//check shipment status every 10 mins
//sync inventory periodically
//🔥 Important Architecture Understanding
//Executor Framework
//
//Provides:
//
//thread management
//Scheduler
//
//Provides:
//
//time-based task execution
//🔥 Java Level
//ScheduledExecutorService
//🔥 Spring Level
//@Scheduled
//TaskScheduler
//ThreadPoolTaskScheduler
//
//Spring simplifies implementation.
//
//🔥 Important Interview Insight
//
//If interviewer asks:
//
//“Why use scheduler instead of creating threads manually?”
//
//Good answer:
//
//“Schedulers use managed thread pools, improve resource utilization, support delayed/periodic execution, and avoid manual thread lifecycle handling.”
//
//🔥 Difference Between fixedRate & fixedDelay
//
//VERY commonly asked.
//
//fixedRate
//@Scheduled(fixedRate = 5000)
//
//Runs every 5 sec:
//
//from task START time
//fixedDelay
//@Scheduled(fixedDelay = 5000)
//
//Runs 5 sec after:
//
//previous execution COMPLETES
//🔥 In Microservices
//
//Schedulers are often used together with:
//
//Kafka
//RabbitMQ
//Redis
//DB polling
//batch jobs
//retry mechanisms
//
//So your multithreading learning is directly relevant to backend development.
//
//🔥 One-line memory
//Spring schedulers are built on top of Java concurrency concepts and thread pools