package com.DSA.Multithreading;

public class Counter {
    private int count = 0;


    //synchronized method will be executed by only one thread
    public synchronized void increment() {
        count++;

        //if we want to synchronize block for specific part in a method
//        synchronized (this) {            //synchronized block will be executed by only one thread
//            count++;
//        }
    }

    public int getCount() {
        return count;
    }
}
