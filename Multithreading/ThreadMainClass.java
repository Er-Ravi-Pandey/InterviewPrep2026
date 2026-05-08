package com.DSA.Multithreading;

class ThreadTest extends Thread
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class
public class ThreadMainClass
{
    public static void main(String[] args)
    {
        int n = 8;
        for (int i=0; i<n; i++)
        {
            ThreadTest object = new ThreadTest();

            // start() is replaced with run() for
            // seeing the purpose of start
            //object.run();

            object.start();
        }
    }
}