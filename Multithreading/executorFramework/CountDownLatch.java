package com.DSA.Multithreading.executorFramework;

import java.util.concurrent.*;

class CountDownLatchEx {


    //When to use CountDownLatch - when we need to wait for multiple threads to complete their execution and then execute main thread
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfDependentServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfDependentServices);
//        Future<String> future = executorService.submit(new DependentService());
//        Future<String> future1 = executorService.submit(new DependentService());
//        Future<String> future2 = executorService.submit(new DependentService());
//        future.get();
//        future1.get();
//        future2.get();


        //here the main thread will be executed after all the dependent services are executed successfully
        // so to avoid this we can use CountDownLatch


        //A CountDownLatch in Java is a synchronization aid
        // that allows one or more threads to wait until a set of operations being performed by other threads completes.


        /*You want the main thread to wait until 3 worker threads finish their setup.

CountDownLatch latch = new CountDownLatch(3);
for (int i = 0; i < 3; i++) {
    executor.submit(() -> {
        // do some task
        latch.countDown();
    });
}
latch.await(); // main thread waits here
System.out.println("All workers done!");


Here, await() blocks until all workers finish.
This is about coordination, not scheduling.



IMPORTANT ------
ONE TIME USE and it wait for all the threads to finish
*/

        CountDownLatch latch = new CountDownLatch(numberOfDependentServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        latch.await();
        System.out.println("Main");
        executorService.shutdown();


        System.out.println("All dependent services finished execution and now starting the main service thread");
        executorService.shutdown();
    }


}

class DependentService implements Callable<String> {


    private final CountDownLatch latch;


    public DependentService(CountDownLatch latch) {
        this.latch = latch;

    }

    public String call() throws Exception {
        // System.out.println(Thread.currentThread().getName()+ " is executing");
        //Thread.sleep(2000);
        try {
            System.out.println(Thread.currentThread().getName() + " is executing");
        } finally {
            latch.countDown();
        }

        latch.countDown();

        return "ok";
    }
}
