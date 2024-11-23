package tn.horizonprod.gestionmagasin;

public class Cashier extends Employee {
	
	private final int cashRegisterNumber;
	
	public Cashier(int id, String name, String address, int hoursPerMonth, int cashRegisterNumber) {
		super(id, name, address, hoursPerMonth);
		this.cashRegisterNumber = cashRegisterNumber;
	}

	@Override
	public void display() {
		System.out.println("Cashier: " + name + " - Cash Register Number: " + cashRegisterNumber);
	}

	@Override
	public double getSalary() {
		var hourlyPrice = 5;
		var overtimeHours = Math.max(hoursPerMonth - 180, 0);
		return hoursPerMonth * hourlyPrice + (overtimeHours * 1.15 * hourlyPrice);
	}
}

