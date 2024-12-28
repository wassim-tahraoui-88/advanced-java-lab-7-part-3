package lab_6;

public class Main {
	public static void main() {
		Company companyTreeMap = new CompanyTreeMap();
		Company companyHashMap = new CompanyHashMap();

		Employee employee1 = new Employee(1, 1, "John", "Doe");
		Employee employee2 = new Employee(2, 2, "Jane", "Doe");
		Employee employee3 = new Employee(3, 3, "Alice", "Doe");
		Employee employee4 = new Employee(4, 4, "Bob", "Doe");

		Department department1 = new Department(1, "HR");
		Department department2 = new Department(2, "IT");
		Department department3 = new Department(3, "Finance");

		companyTreeMap.addEmployeeToDepartment(employee1, department1);
		companyTreeMap.addEmployeeToDepartment(employee2, department2);
		companyTreeMap.addEmployeeToDepartment(employee3, department3);
		companyTreeMap.addEmployeeToDepartment(employee4, department1);

		companyHashMap.addEmployeeToDepartment(employee1, department1);
		companyHashMap.addEmployeeToDepartment(employee2, department2);
		companyHashMap.addEmployeeToDepartment(employee3, department3);
		companyHashMap.addEmployeeToDepartment(employee4, department1);

		companyTreeMap.displayEmployeesWithDepartments();
		companyHashMap.displayEmployeesWithDepartments();

		companyTreeMap.displayEmployees();
		companyHashMap.displayEmployees();

		companyTreeMap.displayDepartments();
		companyHashMap.displayDepartments();

		companyTreeMap.displayDepartment(employee1);
		companyHashMap.displayDepartment(employee1);

		System.out.println(companyTreeMap.searchEmployee(employee1));
		System.out.println(companyHashMap.searchEmployee(employee1));

		System.out.println(companyTreeMap.searchDepartment(department1));
		System.out.println(companyHashMap.searchDepartment(department1));
	}
}
