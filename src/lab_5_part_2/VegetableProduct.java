package lab_5_part_2;

public class VegetableProduct extends AgriculturalProduct {

	protected VegetableProduct(int id, String type, String label, int quantity, int season) {
		super(id, type, label, quantity, season);
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
