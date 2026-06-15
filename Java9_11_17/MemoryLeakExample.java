package com.DSA.Java9_11_17;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {

            // Items keep being added but never removed
            list.add("Item " + i);
        }
        //this list will keep growing and consuming more memory, leading to a potential memory leak if not handled properly.
        Runtime runtime = Runtime.getRuntime();

        // Run garbage collector first for a cleaner baseline (optional)
        runtime.gc();

        // Calculate memory metrics in bytes
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;

        // Convert to Megabytes for readability
        long mb = 1024 * 1024;
        System.out.println("Used Memory: " + (usedMemory / mb) + " MB");
        System.out.println("Free Memory: " + (freeMemory / mb) + " MB");
        System.out.println("Total Allocated Memory: " + (totalMemory / mb) + " MB");
        System.out.println("Max JVM Memory (-Xmx): " + (maxMemory / mb) + " MB");
        System.out.println("Finished adding items!");
    }

    }
