package com.DSA.Multithreading;

public class Main {
    //Multithreading refers to multiple threads of execution within a single process
    //Multithreading enhances the efficiency of multitasking by breaking up a task into smaller subtasks or threads
    //Multitasking can be achieved by creating multiple threads and executing them concurrently
    //While multithreading can improve performance
    //Example - Manager in office (Multitasking) by assigning tasks to employees under 4 teams
    // (Multithreading as multiple employees are working on different tasks at the same time)


    //Mulithreading in Java

    /* Multithreading is the concurrent execution of multiple threads to maximize
    * the utilization of CPU. Java's multithreading is provided by the java.lang package
    *
    * JVM runs multiple threads
    *
    * Java Support Multithreading through its java.lang.Thread class and the java.lang.Runnable interface
    *
    *
    * When a java program starts, a main thread is created.This thread executes the main method*/

   //to implement thread class in java we need to implement Runnable interface or extend Thread class

    public static void main(String[] args) {

        //to show java executed through main thread

      WorldRunnable WorldRunnable = new WorldRunnable(); //New State of thread
        Thread thread = new Thread(WorldRunnable);
        thread.start(); //Runnable State -it is waiting to be executed



//     WorldThread world = new WorldThread();
//        world.start();

        for(int i=0;i<1000000;i++) {
            System.out.println("Hello" + i);
        }


        System.out.print(Thread.activeCount());
//        Thread mainThread = Thread.currentThread();
//
//        System.out.println("Current Thread Name: "+mainThread.getName());
//
//
//
//        Runnable run = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello" + i);
//            }
//        };
//        Thread thread = new Thread(run);
//        thread.run();
    }
}