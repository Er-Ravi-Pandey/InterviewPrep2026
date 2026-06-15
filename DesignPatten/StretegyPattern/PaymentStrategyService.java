package com.DSA.DesignPatten.StretegyPattern;

public class PaymentStrategyService implements PaymentStrategy {
    private PaymentStrategy paymentStrategy;

    public PaymentStrategyService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
