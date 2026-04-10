package com.DSA.Multithreading.executorFramework;

import java.util.concurrent.Executors;

public class ExecutorCachedThreadPool {


    //cached thread pool is a thread pool that creates new threads as needed to execute tasks.
    //Imp - It dynamically adjust pool size based on the number of tasks to be executed.
    //it should be used when load is variable and it is short lived tasks

    java.util.concurrent.ExecutorService executor = Executors.newCachedThreadPool();
}
