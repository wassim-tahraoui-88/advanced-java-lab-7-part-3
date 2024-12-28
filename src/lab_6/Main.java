package lab_6;

public class Main {
	public static void main() {
		var student1 = new Student(1, "John", "Doe");
		var student2 = new Student(2, "Jane", "Doe");
		var student3 = new Student(3, "Foo", "Bar");
		var student4 = new Student(1, "Lorem", "Ipsum");

		var teacher1 = new Teacher(1, "John", "Doe");
		var teacher2 = new Teacher(2, "Jane", "Doe");
		var teacher3 = new Teacher(3, "Foo", "Bar");
		var teacher4 = new Teacher(1, "Lorem", "Ipsum");

		System.out.println(student1.equals(student2)); // false
		System.out.println(student1.equals(student4)); // true

		System.out.println(teacher2.equals(teacher3)); // false
		System.out.println(teacher1.equals(teacher4)); // true

		var horizonArrayList = new HorizonArrayList();
		horizonArrayList.addStudent(student1);
		horizonArrayList.addStudent(student2);
		horizonArrayList.displayStudents();

		var horizonHashSet = new HorizonHashSet();
		horizonHashSet.addTeacher(teacher1);
		horizonHashSet.addTeacher(teacher2);
		horizonHashSet.addTeacher(teacher3);
		horizonHashSet.displayTeachers();

		horizonHashSet.deleteTeacher(teacher2);

		horizonHashSet.displayTeachers();
	}
}
