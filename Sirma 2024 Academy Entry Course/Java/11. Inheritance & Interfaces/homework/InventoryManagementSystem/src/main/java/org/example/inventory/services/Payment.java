package org.example.inventory.services;

public class Payment {
    private String method;
    private double amount;

    public Payment(String method, double amount) {
        this.method = method;
        this.amount = amount;
    }

    public boolean processPayment() {
        System.out.println("Processing payment of: " + amount + "using" + method);
        return true;
    }
}
