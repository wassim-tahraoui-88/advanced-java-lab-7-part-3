package lab_5;

public abstract class User {

	protected final int userId;
	protected final String name;
	protected final String email;

	public User(int userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}

	abstract void login();

	public String getRole() { return "User"; }

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass()) return false;
		return userId == ((User) obj).userId;
	}
}

