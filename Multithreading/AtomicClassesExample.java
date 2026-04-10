package com.DSA.Multithreading;

import com.sun.jdi.PathSearchingVirtualMachine;

//Atomic classes are thread-safe
public class AtomicClassesExample {
    //private  int count = 0;

    private java.util.concurrent.atomic.AtomicInteger count = new java.util.concurrent.atomic.AtomicInteger(0);
    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();

    }

    public static void main(String[] args) {
        AtomicClassesExample counter = new AtomicClassesExample();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });



        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
