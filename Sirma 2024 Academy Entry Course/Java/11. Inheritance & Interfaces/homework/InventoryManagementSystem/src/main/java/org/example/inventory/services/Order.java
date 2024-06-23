package org.example.inventory.services;

import org.example.inventory.models.InventoryItem;

import java.util.*;

public class Order {
    private int orderId;
    private List<InventoryItem> items;
    private double totalCost;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.totalCost = 0.0;
    }

    public void addItem(InventoryItem item, int quantity) {
        items.add(item);
        totalCost += item.getPrice() * quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public boolean processOrder(Payment payment) {
        if (payment.processPayment()) {
            System.out.println("Order" + orderId + "process successfully.");
            return true;
        }
        return false;
    }
}
