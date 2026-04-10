package com.DSA.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private  final Lock lock = new ReentrantLock();


//“Reentrant” means a thread can acquire the same lock multiple times without causing itself to block.

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println( "outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        lock.lock();
        try {
            System.out.println("inner method");
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        reentrantExample.outerMethod();
        reentrantExample.innerMethod();
    }
}
