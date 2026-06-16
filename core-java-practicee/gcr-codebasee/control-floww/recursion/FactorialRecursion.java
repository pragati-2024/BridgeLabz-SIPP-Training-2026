import java.util.Scanner;

public class FactorialRecursion {

    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Base Case
            return 1;
        }
        return n * factorial(n - 1); // Recursive Call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("Factorial of " + n + " is: " + result);
    }
}