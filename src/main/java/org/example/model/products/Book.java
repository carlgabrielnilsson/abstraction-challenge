package org.example.model.products;

import org.example.model.ProductForSale;

public class Book extends ProductForSale {
    private final String author;
    public Book(String type, double price, String description, String author) {
        super(type, price, description);
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.printf("Book: %s by %s%nDescription: %s%nPrice: $%.2f%n", getType(), author, getDescription(), getPrice());
    }
}
