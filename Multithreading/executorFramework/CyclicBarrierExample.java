package com.DSA.Multithreading.executorFramework;

import java.util.concurrent.*;

public class CyclicBarrierExample {



  //when we want to reuse a resource across multiple threads
    //CyclicBarrier is a synchronization aid that allows one or more threads to wait until a set of threads reaches a common barrier point.


       public static void main(String[] args) throws ExecutionException, InterruptedException {
            int numberOfDependentServices = 3;
            ExecutorService executorService = Executors.newFixedThreadPool(numberOfDependentServices);

            CyclicBarrier barrier = new CyclicBarrier(numberOfDependentServices);
            executorService.submit(new com.DSA.Multithreading.executorFramework.DependentService1(barrier));
            executorService.submit(new com.DSA.Multithreading.executorFramework.DependentService1(barrier));
            executorService.submit(new com.DSA.Multithreading.executorFramework.DependentService1(barrier));


            System.out.println("Main");
            executorService.shutdown();



            System.out.println("All dependent services finished execution and now starting the main service thread");
            executorService.shutdown();
        }


    }

    class DependentService1 implements Callable<String> {


        private final CyclicBarrier barrier;


        public DependentService1(CyclicBarrier barrier) {
            this.barrier = barrier;

        }

        public String call() throws Exception {
            // System.out.println(Thread.currentThread().getName()+ " is executing");
            //Thread.sleep(2000);
            try {
                System.out.println(Thread.currentThread().getName() + " is executing");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
                barrier.await();
            } finally {
            }
       barrier.await();

            return "ok";
        }
    }







