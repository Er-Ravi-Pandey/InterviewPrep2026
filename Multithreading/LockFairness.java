package com.DSA.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFairness {

    public final Lock lock = new ReentrantLock(true);
//adding true make the thread call fair by acquiring the thread in order arbitration in FIFO and also avoid starvation

    //Synchronized block doesn't have any fairness , blocking , Interruptibility and read/write locking

    public void accessResource() {

        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "Acquired the lock" + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + "Releasing the lock" + Thread.currentThread().getName());
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        LockFairness lockFairness = new LockFairness();
        Runnable run = () -> lockFairness.accessResource();


        Thread thread1 = new Thread(run, "Thread 1");
        Thread thread2 = new Thread(run, "Thread 2");
        Thread thread3 = new Thread(run, "Thread 3");


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
