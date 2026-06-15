package com.DSA.DesignPatten.StretegyPattern;


/*Real-Life Example: Google Maps

When you choose:
Car
Bike
Walking

Google Maps changes the route calculation algorithm.

RouteStrategy
      |
----------------------
|         |          |
Car      Bike     Walking

This is Strategy Pattern.



Spring Boot Example

A very common interview example:

Notification system.

NotificationStrategy

Implementations:

EmailNotification
SmsNotification
PushNotification
WhatsappNotification*/

//Strategy Pattern defines a family of algorithms,
// encapsulates each algorithm in a separate class, and allows them to be selected interchangeably at runtime.
public class PaymentsMain {
    public static void main(String[] args) {
        // Create different payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy upiPayment = new UPIPayment();
        PaymentStrategy paypalPayment = new PayPalPayment();

        // Create a payment service and set the strategy
        PaymentStrategyService paymentService = new PaymentStrategyService(creditCardPayment);
        paymentService.pay(100.0); // Process credit card payment

        // Change the strategy to UPI and process payment
        paymentService = new PaymentStrategyService(upiPayment);
        paymentService.pay(200.0); // Process UPI payment

        // Change the strategy to PayPal and process payment
        paymentService = new PaymentStrategyService(paypalPayment);
        paymentService.pay(300.0); // Process PayPal payment
    }
}
