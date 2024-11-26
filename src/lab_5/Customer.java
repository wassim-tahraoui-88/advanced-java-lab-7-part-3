package lab_5;

public class Customer extends User {

	private final int loyaltyPoints;
	public int getLoyaltyPoints() { return loyaltyPoints; }

	public Customer(int userId, String name, String email, int loyaltyPoints) {
		super(userId, name, email);
		this.loyaltyPoints = loyaltyPoints;
	}
	
	@Override
	void login() {
		System.out.println("I'm a customer, I have logged in.");
	}

	@Override
	public String getRole() { return "Customer"; }
}
