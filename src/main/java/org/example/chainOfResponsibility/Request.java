package org.example.chainOfResponsibility;

public class Request {
    private final double amount;
    private final String type;
    public Request(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }
    public double getAmount() {
        return amount;
    }
    public String getType() {
        return type;
    }
}
