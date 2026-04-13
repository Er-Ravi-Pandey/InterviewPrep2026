package com.DSA.DesignPatten.Singleton;

public enum EnumSinglelton {
    INSTANCE;


    public static void main(String[] args) {


        EnumSinglelton instance = EnumSinglelton.INSTANCE;
        EnumSinglelton instance2 = EnumSinglelton.INSTANCE;
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        /*Best Singleton in Java:

enum Singleton {
    INSTANCE;
}

✔ Safe from:

Reflection
Serialization
Thread issues*/
    }
}