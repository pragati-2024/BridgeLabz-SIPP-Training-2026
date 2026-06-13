import java.util.Scanner;

public class PalindromeChecker {

    static boolean method1(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    static boolean method2(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return method2(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        System.out.println("Method 1: " + method1(text));
        System.out.println("Method 2: " + method2(text, 0, text.length() - 1));
    }
}