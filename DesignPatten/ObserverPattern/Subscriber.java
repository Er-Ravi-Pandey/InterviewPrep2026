package com.DSA.DesignPatten.ObserverPattern;

import java.util.Objects;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber)) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void notified(String newVideoUploaded) {
        System.out.println(name + " got notification: " + newVideoUploaded);
    }
}