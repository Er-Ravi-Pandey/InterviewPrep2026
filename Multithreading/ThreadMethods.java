package com.DSA.Multithreading;

public class ThreadMethods extends Thread{


    public ThreadMethods(String name) {
        super("ThreadMethods");
        this.setName(name);

    }
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            String a="";
            for(int j=0;j<100;j++) {a=a+"a";}
            try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority() + "count"+ i);

        }}


    public static void main(String  [] args) throws InterruptedException {
        Thread thread = new ThreadMethods("Low Priority");
        Thread thread1 = new ThreadMethods("Normal Priority");
        Thread thread2 = new ThreadMethods("High Priority");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        Thread.yield(); // to give hint/chance to JVM for other thread to execute other thread to execute
        try {
            thread1.interrupt();// to stop the thread execution

        } catch (Exception e) {
            throw new InterruptedException();
        }
        //thread1.interrupt();// to stop the thread execution
        thread1.start();
        thread2.start();
        thread.join(); //main thread will wait for thread to complete its execution


        //Daemon Thread - it will be executed in background and will not interrupt main thread
        //and JVM will not wait for daemon thread to complete its execution ,Ex:Garbage Collection

    }
}
