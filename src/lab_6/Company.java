package lab_6;

public interface Company {
	void addEmployeeToDepartment(Employee employee, Department department);
	void removeEmployee(Employee employee);
	void displayEmployeesWithDepartments();
	void displayEmployees();
	void displayDepartments();
	void displayDepartment(Employee employee);
	boolean searchEmployee(Employee employee);
	boolean searchDepartment(Department department);
}
