package lab_6;

import java.util.HashSet;

public class HorizonHashSet implements TeacherManagement {

	private final HashSet<Teacher> teachers;

	public HorizonHashSet() {
		teachers = new HashSet<>();
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
