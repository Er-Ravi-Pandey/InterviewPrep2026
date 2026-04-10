package com.DSA.Multithreading;

public class ThreadLifeCycle extends Thread{

    public void run(){
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ThreadLifeCycle();
        System.out.println(thread.getState()); //NEW
        thread.start();
        System.out.println(thread.getState());//RUNNABLE
        Thread.sleep(100); //it will pause main method for 100 ms
        System.out.println(thread.getState()); //TIMED_WAITING - means it is waiting for other thread to complete its execution
        thread.join();
        System.out.println(thread.getState()); //TERMINATED
        System.out.println(Thread.activeCount() + " active threads" + Thread.currentThread().getName());
    }
}
