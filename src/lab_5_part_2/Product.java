package lab_5_part_2;

public abstract class Product {
	protected final int id;
	protected final String type;
	protected final String label;
	protected int quantity;

	protected Product(int id, String type, String label, int quantity) {
		this.id = id;
		this.type = type;
		this.label = label;
		this.quantity = quantity;
	}

	public abstract String determineProductType();

	public String getLabel() { return label; }
	public int getQuantity() { return quantity; }
}

