package org.example.inventory.interfaces;

public interface Perishable {
    boolean isPerishable();
    void handleExpiration();
}
