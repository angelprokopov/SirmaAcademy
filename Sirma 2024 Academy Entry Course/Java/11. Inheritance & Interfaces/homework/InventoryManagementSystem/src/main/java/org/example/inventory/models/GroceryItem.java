package org.example.inventory.models;

public class GroceryItem extends InventoryItem {
    public GroceryItem(int id, int quantity, double price) {
        super(id, quantity);
        setPrice(price);
        setCategory("Grocery");
    }

    @Override
    public double calculateValue() {
        return getQuantity() * getPrice();
    }
}
