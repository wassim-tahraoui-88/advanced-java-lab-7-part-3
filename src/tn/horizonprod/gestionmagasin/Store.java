package tn.horizonprod.gestionmagasin;

public class Store {

    private int id;
    private String address;
    private int storeCapacity;
    private Product[] products;

    public Store(int id, String address) {
        this.id = id;
        this.address = address;
        this.storeCapacity = 50;
        this.products = new Product[storeCapacity];
    }
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("The store has reached maximum capacity and cannot add a new product");
    }

    public void display() {
        System.out.println("This store of [" + id + "] is located at " + address + " and has the following products in stock:");
        for (Product product : products) {
            if (product != null) product.display();
        }
        System.out.println("------");
    }
}
