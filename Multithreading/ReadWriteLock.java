package com.DSA.Multithreading;

public class ReadWriteLock {


    /*A ReadWriteLock is a special kind of lock that allows:

Multiple threads to read a shared resource at the same time,

But only one thread to write, and no readers can read while writing is in progress.

Think of it like a library:

Many people can read books simultaneously (multiple readers).

But when someone wants to rearrange or edit the books (write), others must wait.

In Java, the most common implementation is:

java.util.concurrent.locks.ReentrantReadWriteLock


It provides two locks:

readLock() — shared lock (many readers can hold it)

writeLock() — exclusive lock (only one writer)


When to Use ReadWriteLock

Use it when:

Reads are more frequent than writes.

You want higher concurrency than a single synchronized block would allow.

Example scenario

In a cache, many threads read data often, but only occasionally a thread updates the cache.
→ Perfect use-case for ReentrantReadWriteLock.



*/
    private int count = 0;

    private final java.util.concurrent.locks.ReadWriteLock lock = new java.util.concurrent.locks.ReentrantReadWriteLock();

    //ReadwriteLock allows multiple threads to read as long as thread is not writing
    private final java.util.concurrent.locks.Lock readLock = lock.readLock();

    private final java.util.concurrent.locks.Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++; // ReadWriteLock is used for multiple threads, so we need to use try catch block to avoid exception
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {

        ReadWriteLock counter = new ReadWriteLock();
        Runnable readTask = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "Reading count: " + i + counter.getCount());
            }
        };

        Runnable writeTask = () -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " Writing count: " + "incremented" );
            }
        };


        Thread writeThread = new Thread(writeTask);
        Thread readThread = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);
        writeThread.start();
        readThread.start();
        readThread2.start();

        writeThread.join();
        readThread.join();
        readThread2.join();

        System.out.println(counter.getCount()+ "Final count");

    }


}
