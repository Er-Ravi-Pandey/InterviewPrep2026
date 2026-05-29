package com.DSA.DesignPatten.ObserverPattern;

import java.io.ObjectInputStream;

public interface Subject {
    void subscribe(Observer ob);
    void unSubscribe(Observer ob);

    void notifyChanges();
}
