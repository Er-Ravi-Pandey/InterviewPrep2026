package com.DSA.DesignPatten.Adapter;


//company decided to use RazorPay as their payment gateway, but the existing system is designed to work with a different payment processor.
// To integrate RazorPay without changing the existing codebase,
// we can create an adapter that implements the PaymentProcessor interface and uses RazorPayGateway to process payments.

//Our Application expects:
//pay()
//
//Third-party SDK provides:
//processPayment()

//They are incompatible, so we need an adapter to bridge the gap.
public class RazorPayGateway{
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " through RazorPay.");
    }
}

