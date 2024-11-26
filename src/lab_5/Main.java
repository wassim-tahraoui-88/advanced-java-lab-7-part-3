package lab_5;

import java.util.Arrays;

public class Main {

	public static void main() {
		Customer customer = new Customer(1, "Alice", "alice@gmail.com", 100);
		System.out.println(customer.getRole());
		Administrator admin = new Administrator(2, "Gabriel", "gabriel12@gmail.com", new String[] { "Create User", "Delete User" });
		System.out.println(admin.getRole());
		System.out.println("Admin privileges: " + Arrays.toString(admin.getPrivileges()));

		performLogin(customer);
		performLogin(admin);

		User user = customer;
		System.out.println(user.getRole()); // This will print "Customer" because the specific object is of type Customer
		System.out.println("I have " + ((Customer) user).getLoyaltyPoints() + " loyalty points.");

		System.out.println(customer.equals(user));
		System.out.println(user.equals(admin));
		System.out.println(admin.equals(user));
	}


	public static void performLogin(User user) {
		user.login();
	}
}
