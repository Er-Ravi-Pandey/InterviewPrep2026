package com.DSA.Multithreading;


/*
* DeadLock is a situation when two or more threads are waiting for each other to complete their execution and both threads are waiting for the other thread to complete its execution
* threads are blocked for each other.
*
* */
class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) { //synchronized method will be executed by only one thread
        System.out.println(Thread.currentThread().getName() + " is Using pen " + this + " and trying to write with paper " + paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writing " + this);
    }
}

class Paper {

    public synchronized void writeWithPaperAndPen(Pen pen) {

        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to write with pen " + pen);
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writing " + this);
    }
}


class Task1 implements Runnable {

    private Pen pen;
    private Paper paper;


    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); //thread 1 locks pen and tries to lock paper
    }
}

class Task2 implements Runnable {

    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }


    @Override
    public void run() {
        synchronized (pen) {
            paper.writeWithPaperAndPen(pen); //thread 2 locks paper and tries to lock pen
            //thread 2 to lock paper when it has lock of pen

        }

    }
}

public class DeadLockExample {

    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Task1 task1 = new Task1(pen, paper);
        Task2 task2 = new Task2(pen, paper);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }

}
