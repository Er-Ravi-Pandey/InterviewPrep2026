package com.DSA.Multithreading;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        CountThread countThread = new CountThread(counter);
        CountThread counterThread2 = new CountThread(counter);
        countThread.start();
        counterThread2.start();
        countThread.join();
        counterThread2.join();
        System.out.println(counter.getCount());

        //here one object counter is being shared between two threads so and this is called race condition
        //thread will have incorrect results as it is not thread safe
        //to avoid this we can use synchronized keyword for mutual exclusion


        //Locking
        //synchronized block
        //Intrinsic lock --> synchronized keyword .Here we don't have control over the thread to how much time it will assign to one thread


        //Extrinsic lock --> these are more advanced locks you can control by yourself
        //using the Lock class from java.util.concurrent.locks. You explicitly acquire and release locks,
        // giving you more control over the thread.
    }
    }