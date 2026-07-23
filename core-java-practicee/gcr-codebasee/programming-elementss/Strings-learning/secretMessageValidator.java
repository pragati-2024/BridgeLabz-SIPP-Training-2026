import java.util.*;

public class secretMessageValidator {
    public static void main(String[] args) {
        // 2. . Secret Message Validator
        // A security application receives a secret code.
        // Write a program that:
        // Accepts a string.
        // Counts vowels, consonants, digits, and special characters.
        // Determines whether the code is "Strong" or "Weak" based on:
        // At least 2 digits
        // At least 1 special character
        // Minimum length of 8
        // Displays a detailed report.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Secret Code: ");
        String s = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }

            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        String strength;

        if (s.length() >= 8 && digits >= 2 && special >= 1) {
            strength = "Strong";
        } else {
            strength = "Weak";
        }

        System.out.println("\n----- Detailed Report -----");
        System.out.println("Length            : " + s.length());
        System.out.println("Vowels            : " + vowels);
        System.out.println("Consonants        : " + consonants);
        System.out.println("Digits            : " + digits);
        System.out.println("Special Characters: " + special);
        System.out.println("Code Strength     : " + strength);

        sc.close();

    }
}