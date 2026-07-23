public class SpyMessageAnalyzer {

    // Reverse a message
    static String reverseMessage(String message) {
        String reversed = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        return reversed;
    }

    // Check palindrome
    static boolean isPalindrome(String message) {
        String reversed = reverseMessage(message);
        return message.equalsIgnoreCase(reversed);
    }

    // Count vowels and consonants
    static void countVowelsAndConsonants(String message) {

        int vowels = 0;
        int consonants = 0;

        message = message.toLowerCase();

        for (int i = 0; i < message.length(); i++) {

            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels     : " + vowels);
        System.out.println("Consonants : " + consonants);
    }

    // Check anagram
    static boolean areAnagrams(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }

    // First non-repeating character
    static char firstNonRepeatingCharacter(String log) {

        for (int i = 0; i < log.length(); i++) {

            char current = log.charAt(i);
            int count = 0;

            for (int j = 0; j < log.length(); j++) {

                if (current == log.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String secretMessage = "madam";

        System.out.println("Original Message : " + secretMessage);
        System.out.println("Reversed Message : "
                + reverseMessage(secretMessage));

        if (isPalindrome(secretMessage)) {
            System.out.println("The message is a palindrome.");
        } else {
            System.out.println("The message is not a palindrome.");
        }

        countVowelsAndConsonants(secretMessage);

        String intercept1 = "listen";
        String intercept2 = "silent";

        if (areAnagrams(intercept1, intercept2)) {
            System.out.println("\nIntercepts are anagrams.");
        } else {
            System.out.println("\nIntercepts are not anagrams.");
        }

        String surveillanceLog = "swiss";

        char result = firstNonRepeatingCharacter(surveillanceLog);

        if (result != '\0') {
            System.out.println(
                    "First Non-Repeating Character: " + result);
        } else {
            System.out.println(
                    "No non-repeating character found.");
        }
    }
}