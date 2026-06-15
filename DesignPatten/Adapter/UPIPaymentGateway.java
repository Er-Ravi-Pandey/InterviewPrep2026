package com.DSA.DesignPatten.Adapter;

public class UPIPaymentGateway implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}
