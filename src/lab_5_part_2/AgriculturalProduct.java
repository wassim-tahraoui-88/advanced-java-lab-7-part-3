package lab_5_part_2;

public abstract class AgriculturalProduct extends Product implements Criterion {

	protected final int season; // month number from 1 to 12;

	protected AgriculturalProduct(int id, String type, String label, int quantity, int season) {
		super(id, type, label, quantity);
		this.season = season;
	}
}
