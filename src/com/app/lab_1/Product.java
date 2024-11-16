package com.app.lab_1;

import java.util.Date;

public class Product {
    private int id;
    private String label;
    private String brand;
    private double price;
    private Date expirationDate;

    public Product() {}

    public Product(int id, String label, String brand) {
        this.id = id;
        this.label = label;
        this.brand = brand;
    }

    public Product(int id, String label, String brand, double price) {
        this.id = id;
        this.label = label;
        this.brand = brand;
        if (price > 0) this.price = price;
        else System.out.println("The price cannot be negative. It will be assigned a 0 as fallback.");
    }

    public void display() {
        System.out.println("• Product ID [" + id + "] called " + label + " produced by " + brand + " costs " + price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
