package tn.horizonprod.gestionmagasin;

public abstract class Employee {

	protected int id;
	protected String name;
	protected String address;
	protected int hoursPerMonth;

	public Employee(int id, String name, String address, int hoursPerMonth) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.hoursPerMonth = hoursPerMonth;
	}

	public abstract void display();

	public abstract double getSalary();
}