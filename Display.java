import java.util.UUID;

public abstract class Display {
    abstract void notification();

    void showToken(UUID token) {
        System.out.println("token generated: " + token);
    }
}
