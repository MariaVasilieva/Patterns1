package org.example.factoryMethod;

public abstract class PaymentProcessor {
    protected abstract Payment createPayment();

    public void process(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
        System.out.println("Payment processed successfully");
    }
}
