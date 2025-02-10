package org.example.model;

public abstract class ProductForSale {
    private final String type;
    private final double price;
    private final String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        double total = getSalesPrice(quantity);

        String border = "==============================================";
        String headerFormat = " %-20s | %-4s | %-8s | %-8s |%n";
        String rowFormat = "| %-20s | %-4d | $%-7.2f | $%-7.2f |%n";

        System.out.println(border);
        System.out.printf(headerFormat, "Item", "Qty", "Unit Price", "Total");
        System.out.println(border);

        System.out.printf(rowFormat, type, quantity, price, total);
        System.out.println(border);

        System.out.printf("Description: %s%n", description);
    }

    public abstract void showDetails();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
