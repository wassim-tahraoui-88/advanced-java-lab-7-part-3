package tn.horizonprod.gestionmagasin;

public class Store {

    private final int id;
	private final String name;
    private final String address;
	private final Product[] products;
	private final Employee[] employees;

    public Store(int id, String name, String address) {
        this.id = id;
	    this.name = name;
	    this.address = address;
        this.products = new Product[ 50 ];
		this.employees = new Employee[ 20 ];
    }
	public void addProduct(Product product) {
		for (int i = 0; i < products.length; i++) {
			if (products[i] == null) {
				products[i] = product;
				return;
			}
			if (products[i].equals(product)) {
				System.out.println("You can't add this product because it already exists in the store");
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

    public void displayProducts() {
        System.out.println("This store of [" + id + "] is located at " + address + " and has the following products in stock:");
        for (Product product : products) {
            if (product != null) product.display();
        }
        System.out.println("------");
    }
    public void displayEmployee() {
		System.out.println("This store of [" + id + "] is located at " + address + " and has the following employees:");
		for (Employee employee : employees) {
			if (employee != null) employee.display();
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

	public void addEmployee(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = employee;
				return;
			}
			if (employees[i].equals(employee)) {
				System.out.println("You can't add this employee because they already work in this store");
				return;
			}
		}
		System.out.println("The store has reached maximum capacity and cannot add a new employee.");
	}

	public String getName() { return name; }

	public void printProductTypes() {
		for (Product p : products) {
			if (p != null) System.out.println("Product of label " + p.getLabel() + " is of type: " + p.determineProductType());
		}
	}

	public int calculateStock() {
		int totalStock = 0;
		for (Product p : products) {
			if (p instanceof FruitProduct)
				totalStock += p.getQuantity();
		}
		return totalStock;
	}
}
