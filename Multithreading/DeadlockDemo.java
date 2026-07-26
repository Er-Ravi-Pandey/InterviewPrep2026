package com.DSA.Multithreading;

class Pen {

}

class Paper {
}

public class DeadlockDemo {

    public static void main(String[] args) throws InterruptedException {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(() -> {

            synchronized (pen) {

                System.out.println("Thread1 locked pen");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (paper) {

                    System.out.println("Thread1 locked paper");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (paper) {

                System.out.println("Thread2 locked paper");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (pen) {

                    System.out.println("Thread2 locked pen");
                }
            }
        });

        t1.start();
        t2.start();


    }
}