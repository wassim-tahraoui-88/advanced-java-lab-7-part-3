package tn.horizonprod.gestionmagasin;

public class VegetableProduct extends AgriculturalProduct {

	protected VegetableProduct(int id, String type, String label, double price, int quantity, int season) {
		super(id, type, label, price, quantity, season);
	}

	@Override
	public String determineProductType() { return "Vegetable"; }

	@Override
	public boolean isFresh(int season) {
		var currentSeason = this.season + 1 == 13 ? 0 : this.season;
		var passedSeason = season + 1 == 13 ? 0 : season;
		return currentSeason + 1 == passedSeason || currentSeason == passedSeason;
	}
}
