package lab_6;

public interface TeacherManagement {
	void addTeacher(Teacher teacher);
	boolean searchTeacher(Teacher teacher);
	boolean searchTeacher(int id);
	void deleteTeacher(Teacher teacher);
	void displayTeachers();
}
