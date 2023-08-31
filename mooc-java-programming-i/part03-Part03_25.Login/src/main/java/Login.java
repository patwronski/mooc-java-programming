import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] users = {{"alex", "sunshine"}, {"emma", "haskell"}};

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean loggedIn = false;

        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                loggedIn = true;
                break;
            }
        }

        if (loggedIn) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}