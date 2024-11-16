package com.app.lab_1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1021, "Milk", "Delight");
        Product p2 = new Product(25100, "Yogurt", "Vitalait");
        Product p3 = new Product(3250, "Tomato", "Sicam", 1.2);

        p1.display();
        p2.display();
        p3.display();

        p1.setPrice(0.7);
        p1.display();

        p2.setPrice(0.85);
        p2.display();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        // The default toString() method displays the package path of the class and the address of the instance object.

        p1.setExpirationDate(new Date("11/16/2024"));
        p2.setExpirationDate(new Date("11/15/2024"));
        p3.setExpirationDate(new Date("11/25/2024"));

    }
}
