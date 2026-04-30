package com.DSA.Collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenHashMapThread {
    public static void main(String[] args) {


        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String> ();

        // Writer Thread → keeps adding values
        Thread writer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put(i, "Value-" + i);
                System.out.println("Writer added: " + i + " = Value-" + i);
                try {
                    Thread.sleep(500); // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Reader Thread → keeps reading values
        Thread reader = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                String value = map.get(i);
                System.out.println("Reader read: " + i + " = " + value);
                try {
                    Thread.sleep(500); // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader.start();
    }
//“ConcurrentHashMap provides thread-safe operations with better performance
// than synchronizedMap by allowing concurrent access using fine-grained locking and non-blocking reads.”
    //🔹 Key features (interview important)
    //✅ Thread-safe
    //
    //No manual synchronization needed
    //
    //✅ Concurrent reads
    //Reads do NOT block
    //✅ Partial locking
    //Only affected part is locked
}