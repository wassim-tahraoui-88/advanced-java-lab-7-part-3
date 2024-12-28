package lab_6;

public class Main {
	public static void main() {
		Student student1 = new Student(1, "John", "Doe");
		Student student2 = new Student(2, "Jane", "Doe");
		Student student3 = new Student(3, "Foo", "Bar");
		Student student4 = new Student(1, "Lorem", "Ipsum");

		System.out.println(student1.equals(student2)); // false
		System.out.println(student1.equals(student4)); // true

		HorizonArrayList horizonArrayList = new HorizonArrayList();
		horizonArrayList.addStudent(student1);
		horizonArrayList.addStudent(student2);
		horizonArrayList.displayStudents();
	}
}
