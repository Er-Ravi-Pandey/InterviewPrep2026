package com.DSA.DesignPatten;

public class SingletonDesign {
    //Design pattern having single object creation in application and which can be used multiple times
    //Like JDBC connection with DB -> singleton DP used for conn. and can be called multiple times.



    //Step1 to implement Singleton is first constructor should be private.
    //By doing this we are restricting object creation in other places.
    private SingletonDesign(){}


    //creating Singleton field so it can be accessed only once and static used so by class.

    private static SingletonDesign singletonDesign;




    //create object with the help of method.
    //Lazy way of creating singleton object
    //Object created when method is called.
    public static SingletonDesign getSingleton(){

        //to check if no instance created then create
        //synchronised block added in case of multithreaded.
        synchronized (SingletonDesign.class) {
            if (singletonDesign == null) {
                singletonDesign = new SingletonDesign();
            }
        }
        return singletonDesign;
    }


    //Eager way of creating Singleton
    //In eager way static variable will be initialized first
    //However , here it create object in advance

    private static SingletonDesign singletonDesignEager=new SingletonDesign();
    public static SingletonDesign getSingletonDesign(){

        return singletonDesignEager;
    }

    public static void main(String[] args) {
       SingletonDesign singletonDesign1= SingletonDesign.getSingleton();
        System.out.println(singletonDesign1.hashCode());

       SingletonDesign singletonDesign2=SingletonDesign.getSingleton();
        System.out.println(singletonDesign2.hashCode());


        SingletonDesign singletonDesign3=SingletonDesign.getSingletonDesign();
        System.out.println(singletonDesign3.hashCode());


        SingletonDesign singletonDesign4=SingletonDesign.getSingletonDesign();
        System.out.println(singletonDesign4.hashCode());


    }
}
