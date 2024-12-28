package lab_6;

public class Employee {

	private int cin;
	private int id;
	private String firstName;
	private String lastName;

	public Employee() {
		this.cin = 0;
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
	}
	public Employee(int cin, int id, String firstName, String lastName) {
		this.cin = cin;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getCin() { return cin; }
	public int getId() { return id; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }

	public void setCin(int cin) { this.cin = cin; }
	public void setId(int id) { this.id = id; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	@Override
	public String toString() {
		return "Employee{" +
				"cin=" + cin +
				", id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}

