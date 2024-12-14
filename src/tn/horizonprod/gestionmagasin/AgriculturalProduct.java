package tn.horizonprod.gestionmagasin;

public abstract class AgriculturalProduct extends Product implements Criterion {

	protected final int season; // month number from 1 to 12;

	protected AgriculturalProduct(int id, String type, String label, double price, int quantity, int season) {
		super(id, type, label, price, quantity);
		this.season = season;
	}
}
