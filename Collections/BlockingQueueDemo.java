package com.DSA.Collections;


import java.util.Comparator;
import java.util.Deque;
import java.util.concurrent.*;

class Producer implements Runnable{

    private BlockingQueue<Integer> queue;
    private int value=0;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true){
            try {
                System.out.println("Producer produced "+value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }

    }
    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }



}



class Consumer implements Runnable{

    private BlockingQueue<Integer> queue;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true){
            try {
                Integer value=queue.take();
                System.out.println("Consumer consumed "+value);

                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }

    }
    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }



}
public class BlockingQueueDemo {

    public static void main(String[] args) {

        //thread safe queue
        //wait for queue to become non empty before adding element
        //simplify concurrency problems like producer- consumer
        //standard queue -- > immediately

        //BlockingQueue
        //put --> Blocks if the queue is full until space becomes available
        //take --> Blocks if the queue is empty until an element becomes available
        //offer -->   Waits for space to become available if the queue is full, otherwise adds the element and returns true. If the queue is full, returns false.


        BlockingQueue<Integer> queue = new java.util.concurrent.ArrayBlockingQueue<>(5);//size of queue
        //a bounded backing queue, backed by an circular array
        //low memory overhead
        //uses a single lock for put and take

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();


        BlockingQueue<Integer> queue5 = new LinkedBlockingQueue<>(5);//size of queue();
        //optianally bounded backed by linkedList
        //uses two separate locks for put and take
        //higher throughput than ArrayBlockingQueue


        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(5, Comparator.reverseOrder());//size of queue();
        //unbounded backed by priority queue
        //Binary heap is used internally
        //head is based on their natural ordering

        queue2.add("Ravi");
        queue2.add("Saurabh");
        queue2.add("Rohit");

        System.out.println(queue2);



    }



}
