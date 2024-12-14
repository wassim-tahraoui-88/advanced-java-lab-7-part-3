package lab_5_part_2;

public class FruitProduct extends AgriculturalProduct {

	protected FruitProduct(int id, String type, String label, int quantity, int season) {
		super(id, type, label, quantity, season);
	}

	@Override
	public String determineProductType() { return "Fruit"; }

	@Override
	public boolean isFresh(int season) { return season == this.season; }
}
