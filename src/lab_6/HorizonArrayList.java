package lab_6;

import java.util.ArrayList;
import java.util.List;

public class HorizonArrayList implements University {

	private final List<Student> students;

	public HorizonArrayList() {
		students = new ArrayList<>();
	}

	@Override
	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public boolean searchStudent(Student student) {
		return students.contains(student);
	}

	@Override
	public boolean searchStudent(String name) {
		for (Student student : students) {
			if (student.getFirstName().equals(name)) return true;
		}
		return false;
	}

	@Override
	public void removeStudent(Student student) {
		students.remove(student);
	}

	@Override
	public void displayStudents() {
		for (Student student : students) System.out.println(student);
	}

	@Override
	public void sortStudentsById() {
		students.sort((s1, s2) -> s1.getId() - s2.getId());
	}

	@Override
	public void sortStudentsByName() {
		students.sort((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
	}
}
