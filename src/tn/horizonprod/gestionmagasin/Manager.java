package tn.horizonprod.gestionmagasin;

public class Manager extends Employee {
	
	private final int bonus;

	public Manager(int id, String name, String address, int hoursPerMonth, int bonus) {
		super(id, name, address, hoursPerMonth);
		this.bonus = bonus;
	}

	@Override
	public void display() {
		System.out.println("Manager: " + name + " - Bonus: " + bonus);
	}

	@Override
	public double getSalary() {
		var hourlyPrice = 10;
		var overtimeHours = Math.max(hoursPerMonth - 160, 0);
		return hoursPerMonth * hourlyPrice + bonus + (overtimeHours * 1.2 * hourlyPrice);
	}
}
