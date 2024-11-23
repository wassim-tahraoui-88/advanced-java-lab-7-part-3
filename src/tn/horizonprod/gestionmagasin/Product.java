package tn.horizonprod.gestionmagasin;

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

	public int getId() { return id; }
	public String getLabel() { return label; }
	public String getBrand() { return brand; }
	public double getPrice() { return price; }

	public void setPrice(double price) { this.price = price; }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Product product = (Product) obj;
		return id == product.id && Double.compare(product.price, price) == 0 && label.equals(product.label);
	}

}
