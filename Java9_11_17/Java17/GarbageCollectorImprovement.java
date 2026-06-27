package com.DSA.Java9_11_17.Java17;

public class GarbageCollectorImprovement {

    /*Java creates objects on the heap.

Employee emp = new Employee();

After emp is no longer reachable, its memory should be reclaimed.

Instead of developers manually freeing memory (like in C/C++),
the Garbage Collector (GC) automatically identifies unreachable objects and frees their memory.

Problem with older GCs

Older garbage collectors often had:

Long pause times (Stop-The-World pauses)
Poor scalability on large heaps
Reduced responsiveness for large applications

Java has continuously improved its garbage collectors over different releases.

Important Garbage Collectors

You don't need to know every detail, but you should recognize these names:

Garbage Collector	Main Goal

Serial GC ->	Simple, single-threaded
Parallel GC	 -> High throughput
G1 GC ->	Balanced throughput and pause times
ZGC	-> Very low pause times
Shenandoah GC ->	Very low pause times


G1 GC is the default GC in modern JDKs, including Java 17.

Instead of collecting the entire heap at once, G1 divides the heap into regions and collects them incrementally.

Benefits:

More predictable pause times
Better performance on large heaps
Good general-purpose choice
ZGC

Designed for applications that require extremely low pause times.

Goal:

Keep GC pauses extremely short, even with very large heaps.

Typical use cases:

Financial systems
Real-time analytics
Large backend services
Shenandoah GC

Another low-latency garbage collector.

Like ZGC, it focuses on minimizing pause times while the application is running.

Java 17 Improvements

Java 17 didn't introduce an entirely new GC, but it included continued improvements to existing collectors such as G1, ZGC, and Shenandoah.

The focus has been on:

Better performance
Lower pause times
Improved scalability
More efficient memory management
Do you need to choose a GC?

Usually, no.

Most Spring Boot applications run perfectly well with the default G1 GC.

Only applications with specific performance or latency requirements typically consider switching to another collector after benchmarking.

Interview Questions
Q1. Which GC is the default in Java 17?

Answer:

G1 (Garbage First) Garbage Collector.

Q2. What is the goal of ZGC?

Answer:

To provide very low pause times, even for applications with very large heaps.

Q3. What is the main advantage of G1 GC?

Answer:

It balances throughput and pause times by collecting memory region by region instead of performing large full-heap collections.

Q4. Do Java developers usually change the default GC?

Answer:

Not often. The default G1 GC is suitable for most applications. Changing the GC is usually based on performance testing and specific workload requirements.

What to remember for interviews

You don't need to explain GC algorithms unless asked.

A concise answer like this is enough:

"Java 17 continues to improve garbage collection, especially G1, ZGC, and Shenandoah. G1 is the default collector and provides a good balance between throughput and pause times. ZGC and Shenandoah are designed for very low pause times, making them suitable for latency-sensitive applications."*/
}
