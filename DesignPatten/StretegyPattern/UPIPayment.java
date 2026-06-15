package com.DSA.DesignPatten.StretegyPattern;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount  );
        // Here you would add the actual logic to process the UPI payment
    }
}
