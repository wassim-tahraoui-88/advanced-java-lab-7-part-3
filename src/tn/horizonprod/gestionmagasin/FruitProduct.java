package tn.horizonprod.gestionmagasin;

public class FruitProduct extends AgriculturalProduct {

	protected FruitProduct(int id, String type, String label, double price, int quantity, int season) {
		super(id, type, label, price, quantity, season);
	}

	@Override
	public String determineProductType() { return "Fruit"; }

	@Override
	public boolean isFresh(int season) { return season == this.season; }
}
