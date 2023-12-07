import java.util.UUID;

class User extends Display {
    protected String userName;
    protected String password;
    protected UUID token;

    void tokenCreation() {
        token = UUID.randomUUID();
    }

    void register(String userName, String password) {
        this.userName = userName;
        this.password = password;
        tokenCreation();
        System.out.println("User Name: " + this.userName);
        System.out.println("Password: " + this.password);
    }

	@Override
	void notification() {
		System.out.println("User Created by User");
		showToken(token);
	}
}