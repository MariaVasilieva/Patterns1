package org.example.factoryMethod;

public class GooglePayProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new GooglePayPayment();
    }
}
