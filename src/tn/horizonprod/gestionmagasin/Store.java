package tn.horizonprod.gestionmagasin;

public class Store {

    private final int id;
	private final String name;
    private final String address;
    private final int storeCapacity;
    private final int employeeCapacity;
    private final Product[] products;
	private final Employee[] employees;

    public Store(int id, String name, String address) {
        this.id = id;
	    this.name = name;
	    this.address = address;
        this.storeCapacity = 50;
        this.employeeCapacity = 20;
        this.products = new Product[storeCapacity];
		this.employees = new Employee[employeeCapacity];
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
			if (employees[i].equals(employee)) {
				System.out.println("You can't add this employee because they already work in this store");
				return;
			}
			if (employees[i] == null) {
				employees[i] = employee;
				return;
			}
		}
		System.out.println("The store has reached maximum capacity and cannot add a new employee.");
	}
}
