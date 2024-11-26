package lab_5;

public class Administrator extends User {

	private final String[] privileges;

	public String[] getPrivileges() { return privileges; }

	public Administrator(int userId, String name, String email, String[] privileges) {
		super(userId, name, email);
		this.privileges = privileges;
	}

	@Override
	void login() {
		System.out.println("I'm the administrator, I have logged in.");
	}

	@Override
	public String getRole() { return "Administrator"; }
}
