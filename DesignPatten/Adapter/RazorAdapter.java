package com.DSA.DesignPatten.Adapter;

public class RazorAdapter implements PaymentProcessor {
    private RazorPayGateway razorPay;

    public RazorAdapter(RazorPayGateway razorPay) {
        this.razorPay = razorPay;
    }

    @Override
    public void pay(double amount) {
        razorPay.processPayment(amount);
    }
}
