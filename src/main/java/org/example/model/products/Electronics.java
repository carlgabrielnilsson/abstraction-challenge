package org.example.model.products;

import org.example.model.ProductForSale;

public class Electronics extends ProductForSale {
    private final String brand;

    public Electronics(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.printf("Electronics: %s by %s%nDescription: %s%nPrice: $%.2f%n", getType(), brand, getDescription(), getPrice());
    }
}
