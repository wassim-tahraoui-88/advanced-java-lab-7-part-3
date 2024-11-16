package tn.horizonprod.gestionmagasin;

import java.util.Date;

public class Product {
    private int id;
    private String label;
    private String brand;
    private double price;

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
        this.price = price;
    }

    public void display() {
        System.out.println("• Product ID [" + id + "] called " + label + " produced by " + brand + " costs " + price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
