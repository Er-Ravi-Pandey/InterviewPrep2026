package com.DSA.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//synchronized	                       ReentrantLock
//automatic lock/unlock	               manual lock/unlock
//less flexible	                       more flexible
//no fairness option	               fairness supported
//cannot interrupt waiting easily	   interruptible lock
//no timeout	                       tryLock() available
//simpler	                           advanced
public class LockFairness {

    public final Lock lock = new ReentrantLock(true);
//adding true make the thread call fair by acquiring the thread in order arbitration in FIFO and also avoid starvation

    //Synchronized block doesn't have any fairness , blocking , Interruptibility and read/write locking

    //ReentrantLock provides more control over locking, including fairness, interruptibility, and the ability to try acquiring a lock
    // without blocking.It is more flexible but requires careful handling to avoid issues like deadlocks or forgetting to release the lock.


    //ReentrantLock internally uses:
    //👉 CAS (Compare And Swap)
    //👉 AQS (AbstractQueuedSynchronizer)

    //
    //“ReentrantLock is an advanced locking mechanism providing more flexibility than synchronized,
    // including tryLock, interruptible locking, fairness policy, and manual lock management.”


    //🔥 12. Real-world use cases
    //Banking systems
    //Concurrent queues
    //Thread pools
    //High-performance systems
    //Deadlock prevention



    //🔥  Important comparison
    //synchronized
    //
    //Good for:
    //
    //simple locking


    //ReentrantLock
    //
    //Good for:
    //
    //complex concurrency control


    //Q:Why use ReentrantLock if synchronized already exists?

    //Because ReentrantLock provides:
    //
    //tryLock()
    //fairness
    //interruptible waiting
    //timeout support
    //advanced concurrency control


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


    public static void main(String[] args) throws InterruptedException {
        LockFairness lockFairness = new LockFairness();
        Runnable run = () -> lockFairness.accessResource();


        Thread thread1 = new Thread(run, "Thread 1");
        Thread thread2 = new Thread(run, "Thread 2");
        Thread thread3 = new Thread(run, "Thread 3");


        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
    }
}
