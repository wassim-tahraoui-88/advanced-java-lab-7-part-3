package tn.horizonprod.gestionmagasin;

public class Salesperson extends Employee {

	private final int salesRate;

	public Salesperson(int id, String name, String address, int hoursPerMonth, int salesRate) {
		super(id, name, address, hoursPerMonth);
		this.salesRate = salesRate;
	}

	@Override
	public void display() {
		System.out.println("Salesperson: " + name + " - Sales Rate: " + salesRate);
	}

	@Override
	public double getSalary() { return 450d * (salesRate / 100d); }
}
