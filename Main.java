import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Registrasi");

        System.out.println("Masukkan User Nama:");
        String userName = in.nextLine();
        
        System.out.println("Masukkan Password:");
        String password = in.nextLine();


        User user = new Admin();
        user.register(userName, password);
        user.notification();
    }
}
