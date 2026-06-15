package com.DSA.DesignPatten.StretegyPattern;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of " + amount  );
        // Here you would add the actual logic to process the PayPal payment
    }
}
