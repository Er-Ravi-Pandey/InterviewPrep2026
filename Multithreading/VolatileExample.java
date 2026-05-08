package com.DSA.Multithreading;


class SharedObjetc {


    //Threads can have their own local cached copy of variables instead of always reading directly from main memory.

    //In multithreading variable stored in thread cache memory to improve the performance  since here flag is set false so it remains
    //false for printIfFlagTrue

    //so to avoid this we can use volatile
    //Thread cache is used to store the value of volatile variable
    private volatile boolean flag = false;
    //after making it volatile it is stored in main memory
    //volatile only uses to make state visible




    //“In Java, each thread may maintain its own working memory or cached copy of shared variables for performance reasons.
    // This can lead to visibility issues unless synchronization or volatile is used.”

    public void setFlagTrue(boolean flag) {
        System.out.println("Writer thread is setting flag true now");
        this.flag = flag;
    }

    public void printIfFlagTrue() {
        while (!flag) {
            //do nothing
        }
        System.out.println("flag is true");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedObjetc sharedObjetc = new SharedObjetc();
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObjetc.setFlagTrue(true);
        });

        Thread readerThread = new Thread(() -> {
            sharedObjetc.printIfFlagTrue();
        });
        writerThread.start();
        readerThread.start();

    }
}
