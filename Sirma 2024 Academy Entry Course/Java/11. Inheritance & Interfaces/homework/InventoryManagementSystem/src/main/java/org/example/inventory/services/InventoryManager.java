package org.example.inventory.services;

import org.example.inventory.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<InventoryItem> items;

    public InventoryManager() {
        items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }

    public void removeItem(int id) {
        items.removeIf(item->item.getId() == id);
    }

    public void listAllItems() {
        for (InventoryItem item : items) {
            item.toString();
        }
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (InventoryItem item : items) {
                bw.write(item.getId() + "," + item.getQuantity() + "," + item.getPrice() + "," + item.getCategory());
                bw.newLine();
            }
        }
    }

    public void loadFromFile(String filename) throws IOException {
        items.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                int quantity = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                String category = parts[3];
                InventoryItem item;
                if (category.equals("Electronics")) {
                    item = new ElectronicsItem(id, quantity, price);
                } else if (category.equals("Grocery")) {
                    item = new GroceryItem(id, quantity, price);
                } else {
                    item = new FragileItem(id, quantity, price, 1.0);
                }
                items.add(item);
            }
        }
    }
}
