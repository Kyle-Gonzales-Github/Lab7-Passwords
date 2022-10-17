import java.util.Scanner;

public class App {

    private static boolean hasDigit = false, hasCapital = false;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password. (8-16 characters, one digit, and one capital letter)");
        String password = scanner.nextLine();
        if (password.length() < 8 || password.length() > 16) {
            System.out.println("Your password is not between 8 and 16 characters.");
            return;
        }
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasCapital = true;
            }
        }
        if (hasDigit == false) {
            System.out.println();
            System.out.println("You do not have a digit in your password.");
            System.out.println();
            return;
        } else if (hasCapital == false) {
            System.out.println();
            System.out.println("You do not have a capital in your password.");
            System.out.println();
            return;
        }
        System.out.println();
        System.out.println("Your password is valid!");
        System.out.println();
    }
}
