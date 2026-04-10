package com.DSA.Multithreading;

public class BankAccountMain {
    //Locking
    //synchronized block
    //Intrinsic lock --> synchronized keyword .Here we don't have control over the thread to how much time it will assign to one thread


    //Extrinsic lock --these are more advanced locks you can control by yourself
    //using the Lock class from java.util.concurrent.locks. You explicitly acquire and release locks,
    // giving you more control over the thread.
    public static void main(String[] args) throws InterruptedException {
        BankAccountLocks sbi = new BankAccountLocks();
        Runnable run = () -> {
            try {
                sbi.withdraw(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread1 = new Thread(run, "Thread 1");
        Thread thread2 = new Thread(run, "Thread 2");
        thread1.start();
        thread2.start();

        }
    }
