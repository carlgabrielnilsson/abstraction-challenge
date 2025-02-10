package org.example;

import org.example.model.*;
import org.example.model.products.Book;
import org.example.model.products.Clothing;
import org.example.model.products.Electronics;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Store {
    private final List<ProductForSale> inventory = new ArrayList<>();
    private final List<OrderItem> order = new ArrayList<>();

    public Store() {
        inventory.add(new Book(
                "Java Abstraction",
                    39.99,
                "An comprehensive guide of abstractions in Java",
                "J. Fitzgerald"
        ));
        inventory.add(new Electronics(
           "Laptop",
           999.99,
           "High-performance laptop with 64GB of RAM.",
           "Lenovo ThinkPad"
        ));
        inventory.add(new Clothing(
                "T-Shirt",
                19.99,
                "Comfortable cotton T-shirt.",
                "M"
        ));
    };

    public void showInventory() {
        System.out.println("\nAvailable Products:");

        for (int i = 0; i < inventory.size(); i++) {
            System.out.print((i + 1) + ". ");
            inventory.get(i).showDetails();
            System.out.println();
        }
        System.out.println("__________________________________________ \n");
    }

    public void addItemToOrder(int productIndex, int quantity) {
        if (productIndex < 0 || productIndex >= inventory.size()) {
            System.out.println("Invalid product selection");
            return;
        }


        ProductForSale selectedProduct = inventory.get(productIndex);
        order.add(new OrderItem(selectedProduct, quantity));
    }

    public void printReceipt() {
        System.out.println("\n=== SALES RECEIPT ===");
        double total = 0;

        for (OrderItem item : order) {
            item.printItem();
            total += item.getTotalPrice();
        }

        System.out.printf("\nTotal Amount: $%.2f%n", total);
    }


    public static void main(String[] args) {
        Store store = new Store();
        store.showInventory();

        store.addItemToOrder(0, 2);
        store.addItemToOrder(1, 1);

        store.printReceipt();
    }
}