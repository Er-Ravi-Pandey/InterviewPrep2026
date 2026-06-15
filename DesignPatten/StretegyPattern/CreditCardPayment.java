package com.DSA.DesignPatten.StretegyPattern;

public class CreditCardPayment implements PaymentStrategy {


    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of " + amount);
        // Here you would add the actual logic to process the credit card payment
    }
}
