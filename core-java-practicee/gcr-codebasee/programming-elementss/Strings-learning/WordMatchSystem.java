import java.util.*;

public class WordMatchSystem {
    // . Word Match System
    // A recruitment portal receives two skill keywords from a candidate.
    // Write a program that:
    // Accepts two strings.
    // Checks whether they are anagrams.
    // Displays both strings in uppercase.
    // Shows the total length of each string.
    // Prints a suitable message based on the result.
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Skill Keyword: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second Skill Keyword: ");
        String str2 = sc.nextLine();

        // Convert strings to lowercase for comparison
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

        System.out.println("\n----- Word Match Report -----");
        System.out.println("First Keyword  : " + str1.toUpperCase());
        System.out.println("Second Keyword : " + str2.toUpperCase());

        System.out.println("Length of First Keyword  : " + str1.length());
        System.out.println("Length of Second Keyword : " + str2.length());

        if (isAnagram) {
            System.out.println("Result: Both skill keywords are ANAGRAMS.");
        } else {
            System.out.println("Result: Both skill keywords are NOT ANAGRAMS.");
        }

        sc.close();
}
