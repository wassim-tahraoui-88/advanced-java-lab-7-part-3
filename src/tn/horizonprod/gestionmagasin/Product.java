package tn.horizonprod.gestionmagasin;

public abstract class Product {
    protected int id;
    protected String label;
    protected String brand;
	protected String type;
    protected double price;
	protected int quantity;

    public Product(int id, String type, String label, double price, int quantity) {
        this.id = id;
		this.type = type;
        this.label = label;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("• Product ID [" + id + "] called " + label +  " costs " + price);
    }

	public int getId() { return id; }
	public String getLabel() { return label; }
	public String getBrand() { return brand; }
	public double getPrice() { return price; }
	public int getQuantity() { return quantity; }

	public void setPrice(double price) { this.price = price; }

	public abstract String determineProductType();

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Product product = (Product) obj;
		return id == product.id && Double.compare(product.price, price) == 0 && label.equals(product.label);
	}

}
