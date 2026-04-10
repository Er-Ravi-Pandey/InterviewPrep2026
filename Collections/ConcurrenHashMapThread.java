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
}