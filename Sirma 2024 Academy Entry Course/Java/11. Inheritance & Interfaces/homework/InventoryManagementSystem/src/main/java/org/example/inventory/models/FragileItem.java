package org.example.inventory.models;

public class FragileItem extends InventoryItem {
    private double weight;

    public FragileItem(int id, int quantity, double price, double weight) {
        super(id, quantity);
        setPrice(price);
        setCategory("Fragile");
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double calculateValue() {
        return getPrice() * getQuantity() * weight;
    }

    @Override
    public boolean isBreakable() {
        return true;
    }

    @Override
    public void handleBreakage() {
        if (isBreakable()) {
            System.out.println("Fragile item handling breakage...");
        }
    }
}
