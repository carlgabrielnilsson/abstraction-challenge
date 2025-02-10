package org.example.model.products;

import org.example.model.ProductForSale;

public class Clothing extends ProductForSale {
    private final String size;

    public Clothing(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.printf("Clothing: %s (Size: %s)%nDescription: %s%nPrice: $%.2f%n", getType(), size, getDescription(), getPrice());
    }
}