package tn.horizonprod.gestionmagasin;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1021, "Milk", "Delight");
        Product p2 = new Product(25100, "Yogurt", "Vitalait");
        Product p3 = new Product(3250, "Tomato", "Sicam", 1.2);
        p1.setPrice(0.7);
        p2.setPrice(0.85);

        Store store = new Store(1560,"Avenue Jamal Abdennasser 70");
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.display();

    }
}
