package tn.horizonprod.gestionmagasin;

public class Store {

    private final int id;
    private final String address;
    private final int storeCapacity;
    private final Product[] products;

    public Store(int id, String address) {
        this.id = id;
        this.address = address;
        this.storeCapacity = 50;
        this.products = new Product[storeCapacity];
    }
	public void addProduct(Product product) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].equals(product)) {
				System.out.println("You can't add this product because it already exists in the store");
				return;
			}
			if (products[i] == null) {
				products[i] = product;
				return;
			}
		}
		System.out.println("The store has reached maximum capacity and cannot add a new product");
	}
	public boolean findProduct(Product p) {
		if (p == null) return false;
		for (Product product : products) {
			if (product != null && product.equals(p)) return true;
		}
		return false;
	}
	public void removeProduct(Product p) {
		if (p == null) return;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null && products[i].equals(p)) {
				products[i] = null;
				return;
			}
		}
	}

    public void display() {
        System.out.println("This store of [" + id + "] is located at " + address + " and has the following products in stock:");
        for (Product product : products) {
            if (product != null) product.display();
        }
        System.out.println("------");
    }

	public boolean compare(Product p) {
		if (p == null) return false;
		for (Product product : products) {
			if (product.equals(p)) return true;
		}
		return false;
	}
	public boolean compare(Product p1, Product p2) {
		if (p1 == null || p2 == null) return false;
		return p1.getId() == p2.getId() && p1.getLabel().equals(p2.getLabel()) && p1.getPrice() == p2.getPrice();
	}

	public Store compare(Store otherStore) {
		var localCount = 0;
		for (Product product : products) {
			if (product != null) localCount++;
		}
		var otherCount = 0;
		for (Product product : otherStore.products) {
			if (product != null) otherCount++;
		}
		return localCount > otherCount ? this : otherStore;
	}
}
