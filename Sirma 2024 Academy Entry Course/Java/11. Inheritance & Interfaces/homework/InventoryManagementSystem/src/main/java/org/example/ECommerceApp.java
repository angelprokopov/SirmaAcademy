package org.example;

import org.example.inventory.services.*;
import org.example.inventory.models.*;

import java.io.IOException;
import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the E-commerce Console Application");
        displayMenu();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Enter command (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    manager.listAllItems();
                    break;
                case 2:
                    System.out.println("Enter item ID to remove ");
                    int itemID = scanner.nextInt();
                    manager.removeItem(itemID);
                    break;
                case 3:
                    System.out.print("Enter item type (Electronics/Grocery/Fragile): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    int itemId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    if (type.equalsIgnoreCase("Electronics")) {
                        manager.addItem(new ElectronicsItem(itemId, quantity, price));
                    } else if (type.equalsIgnoreCase("Fragile")) {
                        System.out.println("Enter weight: ");
                        double weight = scanner.nextDouble();
                        manager.addItem(new FragileItem(itemId, quantity, price, weight));
                    } else if (type.equalsIgnoreCase("Groceries")) {
                        manager.addItem(new GroceryItem(itemId, quantity, price));
                    } else {
                        System.out.println("Invalid item type");
                    }
                    break;
                case 4:
                    System.out.println("Enter filename to save: ");
                    String filename = scanner.next();
                    try {
                        manager.saveToFile(filename);
                    } catch (IOException ex) {
                        System.out.println("Error saving to file: " + ex.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Enter filename to load: ");
                    filename = scanner.next();
                    try {
                        manager.loadFromFile(filename);
                    } catch (IOException ex) {
                        System.out.println("Error loading from file: " + ex.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. List Items");
        System.out.println("2. Remove Item");
        System.out.println("3. Add Item");
        System.out.println("4. Save Inventory to File");
        System.out.println("5. Load Inventory from File");
    }
}