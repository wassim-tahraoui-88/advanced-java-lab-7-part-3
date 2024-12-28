package lab_6;

public class Student {
	private int id;
	private String firstName;
	private String lastName;


	public Student() {
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
	}
	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		var student = (Student) o;
		return id == student.id;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + firstName + '\'' +
				", firstName='" + lastName + '\'' +
				'}';
	}
}
