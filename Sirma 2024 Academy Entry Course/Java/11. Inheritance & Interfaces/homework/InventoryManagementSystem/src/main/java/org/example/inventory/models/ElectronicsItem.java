package org.example.inventory.models;

public class ElectronicsItem extends InventoryItem {
    public ElectronicsItem(int id, int quantity, double price) {
        super(id, quantity);
        setPrice(price);
        setCategory("Electronics");
    }

    @Override
    public double calculateValue() {
        return getQuantity() * getPrice();
    }
}
