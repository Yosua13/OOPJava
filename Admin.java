public class Admin extends User {

    private final String role = "Admin";

    @Override
	void notification() {
		System.out.println("User Created by " + role);
		showToken(this.token);
	}
}
