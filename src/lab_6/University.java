package lab_6;

public interface University {

	void addStudent(Student student);

	boolean searchStudent(Student student);

	boolean searchStudent(String name);

	void removeStudent(Student student);

	void displayStudents();

	void sortStudentsById();

	void sortStudentsByName();
}
