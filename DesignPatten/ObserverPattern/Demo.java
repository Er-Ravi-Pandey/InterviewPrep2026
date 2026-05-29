package com.DSA.DesignPatten.ObserverPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) throws IOException {
        Subject channel = new YoutubeChannel();

     // Observer subscriber1 = new Subscriber("Ravi");
    //  Observer subscriber2 = new Subscriber("Saurabh");


        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to upload new video");
            System.out.println("Press 2 to create new subscriber");
            System.out.println("Press 3 to unsubscribe");


            int c = Integer.parseInt(reader.readLine());

            String name;
            String unsubscribername;
            if (c == 1) {
                channel.notifyChanges();
            } else if (c == 2) {
                System.out.println("Enter subscriber name");
                name = reader.readLine();
                Subscriber subscriber = new Subscriber(name);
                channel.subscribe(subscriber);

            } else if (c == 3) {
                System.out.println("Enter you name to unsubscribe");
                unsubscribername = reader.readLine();
                Subscriber unsubscriber = new Subscriber(unsubscribername);

                channel.unSubscribe(unsubscriber);
                System.out.println(unsubscribername+ "Unsubscribe ");


            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
