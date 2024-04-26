package br.com.exe05.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
        } else {
            System.out.println("Invalid quantity");
        }
    }

    public void removeProducts(int quantity) {
        if (quantity > 0) {
            this.quantity -= quantity;
        } else {
            System.out.println("Invalid quantity");
        }
    }
}
