import java.util.*;

public class usernameValidator {
    // 1. Username Validator
    // A company wants to validate usernames entered by users.
    // Write a program that:
    // Accepts a username.
    // Checks whether it contains any spaces.
    // Counts the total number of characters.
    // Converts the username to uppercase.
    // Displays whether the username is a palindrome.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        // Check spaces
        if (username.contains(" ")) {
            System.out.println("Username contains spaces.INVALID USERNAME");
        } else {
            System.out.println("Username does not contain spaces.");
        }

        System.out.println("Total characters: " + username.length());
        System.out.println("Uppercase Username: " + username.toUpperCase());
        String reversed = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            reversed += username.charAt(i);
        }
        if (username.equals(reversed)) {
            System.out.println("Username is a Palindrome.");
        } else {
            System.out.println("Username is not a Palindrome.");
        }

        sc.close();
    }

}
