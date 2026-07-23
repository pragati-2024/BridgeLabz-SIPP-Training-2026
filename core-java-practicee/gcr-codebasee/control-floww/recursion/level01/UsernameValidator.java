import java.util.Scanner;

public class UsernameValidator {

    public static boolean isValidUsername(
            String username,
            int index) {

        if (index == username.length()) {
            return true;
        }

        char currentCharacter =
                username.charAt(index);

        if (currentCharacter < 'a'
                || currentCharacter > 'z') {
            return false;
        }

        return isValidUsername(
                username,
                index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.println(
                "Valid Username: " +
                isValidUsername(username, 0));
    }
}