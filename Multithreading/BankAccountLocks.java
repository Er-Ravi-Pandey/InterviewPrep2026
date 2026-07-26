package com.DSA.Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLocks {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw" + amount);
        try {

            if (lock.tryLock(4000, TimeUnit.MILLISECONDS)) { //this is trying to acquire the lock for 1 second else it will return false
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + "processing withdraw" + amount);


                    try {
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "withdraw completed successfully" + amount);
                        System.out.println("Remaining balance =" + balance);

                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }


                } else {
                    System.out.println(Thread.currentThread().getName() + "insufficient balance for withdraw" + balance);
                }

            } else {
                System.out.println(Thread.currentThread().getName() + "unable to obtain lock");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}






   /* public synchronized void withdraw(int amount) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "attempting to withdraw" + amount);
        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + "processing withdraw" + amount);

            Thread.sleep(10000);

        balance -= amount;
            System.out.println(Thread.currentThread().getName() + "withdraw completed successfully" + amount);
            System.out.println("Remaining balance =" + balance);

        }else{
            System.out.println(Thread.currentThread().getName() + "insufficient balance for withdraw" + balance);
        }



    */



