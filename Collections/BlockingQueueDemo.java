package com.DSA.Collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {




        //🔹 What is a BlockingQueue?
        //
        //👉 A thread-safe queue where:
        //
        //If queue is empty → consumer waits
        //If queue is full → producer waits
        //
        //👉 No manual wait/notify needed

        //👉 BlockingQueue automatically handles coordination between threads

        //🔹 Why do we need it?
        //
        //Without BlockingQueue:
        //
        //You’d have to write:
        //synchronized
        //wait()
        //notify()
        //
        //👉 Complex + error-prone



        //With BlockingQueue:
        //
        //👉 Java handles everything internally



       //🔹 When to use
    //
    //👉 Use when:
    //
    //Producer-consumer pattern
    //Task queue (very common in microservices)
    //Thread pool internals


    /*BlockingQueue is a thread-safe queue that supports blocking operations like put and take,
    allowing threads to wait automatically when the queue is full or empty.
    It is commonly used in producer-consumer scenarios*/
        public static void main(String[] args) {

            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);

            // Producer
            new Thread(() -> {
                try {
                    queue.put(1);
                    System.out.println("Produced 1");

                    queue.put(2);
                    System.out.println("Produced 2");

                    queue.put(3); // waits (queue full)
                    System.out.println("Produced 3");

                } catch (Exception e) {}
            }).start();

            // Consumer
            new Thread(() -> {
                try {
                    Thread.sleep(1000);

                    System.out.println("Consumed " + queue.take());
                    System.out.println("Consumed " + queue.take());

                } catch (Exception e) {}
            }).start();
        }
    }




