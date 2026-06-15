package com.DSA.DesignPatten.Adapter;

public class ProcessPaymentMain {
    public static void main(String[] args) {
        // Using UPI
        PaymentProcessor upiProcessor = new UPIPaymentGateway();
        PaymentService paymentService1 = new PaymentService(upiProcessor);
        paymentService1.processPayment(100.0);

        // Using RazorPay
        PaymentProcessor razorProcessor = new RazorAdapter(new RazorPayGateway());
        PaymentService paymentService2 = new PaymentService(razorProcessor);
        paymentService2.processPayment(200.0);
    }
}
