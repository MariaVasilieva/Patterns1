package org.example.factoryMethod;

public class GooglePayPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Google Pay Payment "+ amount);
    }
}
