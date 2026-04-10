package com.DSA.Collections;


import java.util.LinkedList;

public class SynchronousQueueDemo {
        private final LinkedList<Object> queue = new LinkedList<>();
        private final Object lock = new Object();

        public void enqueue(Object item) {
            synchronized (lock) {
                queue.add(item);
                lock.notifyAll();
            }
        }

        public Object dequeue() throws InterruptedException {
            synchronized (lock) {
                while (queue.isEmpty()) {
                    lock.wait();
                }
                return queue.poll();
            }
        }


    public static void main(String[] args) {

    }
}
