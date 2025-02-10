package org.example.model;

public class OrderItem {
    private final ProductForSale product;
    private final int quantity;

    public OrderItem(ProductForSale product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void printItem() {
        product.printPricedItem(quantity);
    }

    public double getTotalPrice() {
        return product.getSalesPrice(quantity);
    }
}
