package com.DSA.Multithreading;



//Thread safety means that a piece of code, function, or class can be safely called
// and executed by multiple threads at the same time without causing inconsistent results, data corruption, or unexpected behavior.
public class LambdaExpression {
    public static void main(String[] args) {
      Runnable run = () -> System.out.println("Hello World");
      Thread thread1 = new Thread(run);
      thread1.run();
      //or
        Thread thread = new Thread(() -> System.out.println("Hello World"));
       thread.start();
    }
}
