package lab_6;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class CompanyTreeMap implements Company {

	private final Map<Employee, Department> employees;

	public CompanyTreeMap() {
		employees = new TreeMap<>((e1, e2) -> e1.getId() - e2.getId());
	}

	@Override
	public void addEmployeeToDepartment(Employee employee, Department department) {
		employees.put(employee, department);
	}

	@Override
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public void displayEmployeesWithDepartments() {
		for (var entry : employees.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}

	@Override
	public void displayEmployees() {
		for (var entry : employees.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

	@Override
	public void displayDepartments() {
		var departments = new HashSet<>(employees.values()); // to remove duplicates easily.
		for (var department : departments) System.out.println(department);
	}

	@Override
	public void displayDepartment(Employee employee) {
		System.out.println(employees.get(employee));
	}

	@Override
	public boolean searchEmployee(Employee employee) {
		for (var entry : employees.entrySet()) {
			if (entry.getKey().equals(employee)) return true;
		}
		return false;
	}

	@Override
	public boolean searchDepartment(Department department) {
		for (var entry : employees.entrySet()) {
			if (entry.getValue().equals(department)) return true;
		}
		return false;
	}
}
