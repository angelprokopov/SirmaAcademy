package org.example.inventory.models;

import org.example.inventory.interfaces.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    private String category;
    private boolean breakable;
    private boolean perishable;
    private double price;

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public boolean isBreakable() {
        return breakable;
    }

    @Override
    public void handleBreakage() {
        if (breakable) {
            System.out.println("Handling breakage.....");
        }
    }

    @Override
    public boolean isPerishable() {
        return perishable;
    }

    @Override
    public void handleExpiration() {
        if (perishable) {
            System.out.println("Handling expiration.....");
        }
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getItemDetails() {
        return "Category" + category + ", Price" + price;
    }

    @Override
    public void displayDescription() {
        System.out.println(getItemDetails());
    }

    @Override
    public double calculateValue() {
        return price;
    }
}
