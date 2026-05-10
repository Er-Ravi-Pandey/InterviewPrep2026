package com.DSA.Multithreading;

public class DaemonThread {


    //“Daemon threads are background support threads that do not prevent JVM shutdown.
    // JVM exits when all user threads finish, even if daemon threads are still running.”


    //Q:
    //
    //Why GC thread is daemon?
    //
    //Answer:
    //
    //Because garbage collection is supportive background work and should not prevent JVM shutdown.

    //🔥 Real-world use cases
    //🟢 Garbage Collection
    //
    //Runs in background.
    //
    //🟢 Auto-save service
    //
    //Background periodic save.
    //
    //🟢 Monitoring/logging threads
    //🟢 Cache cleanup threads
}
