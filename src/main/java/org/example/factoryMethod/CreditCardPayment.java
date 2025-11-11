package org.example.factoryMethod;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment credit card " + amount );
    }
}
