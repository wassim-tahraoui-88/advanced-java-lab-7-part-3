package lab_6;

import java.util.TreeSet;

public class HorizonTreeSet implements TeacherManagement {

	private final TreeSet<Teacher> teachers;

	public HorizonTreeSet() {
		teachers = new TreeSet<>((x,y) -> x.getId() - y.getId());
	}

	@Override
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	@Override
	public boolean searchTeacher(Teacher teacher) {
		return teachers.contains(teacher);
	}

	@Override
	public boolean searchTeacher(int id) {
		for (var teacher : teachers) {
			if (teacher.getId() == id) return true;
		}
		return false;
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}

	@Override
	public void displayTeachers() {
		for (var teacher : teachers) System.out.println(teacher);
	}
}
