package lab_5_part_2;

import java.util.LinkedList;
import java.util.List;

public class Store {
	private final String name;
	private final List<Product> products;

	public Store(String name) {
		this.name = name;
		this.products = new LinkedList<>();
	}

	public void printProductTypes() {
		for (Product p : products) {
			System.out.println("Product of label " + p.getLabel() + " is of type: " + p.determineProductType());
		}
	}

	public void addProduct(Product p) { products.add(p); }

	public int calculateStock() {
		int totalStock = 0;
		for (Product p : products) {
			if (p instanceof FruitProduct)
				totalStock += p.getQuantity();
		}
		return totalStock;
	}

	public String getName() { return name; }
}
