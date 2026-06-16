import java.util.Scanner;

public class MathWizard {

    // Instance Variable
    int instanceNumber = 100;

    // Check Prime Number
    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Factorial using Iteration (int)
    public long factorial(int number) {

        long factorialValue = 1;

        for (int i = 1; i <= number; i++) {
            factorialValue *= i;
        }

        return factorialValue;
    }

    // Overloaded Factorial (double)
    public double factorial(double number) {

        double factorialValue = 1;

        for (int i = 1; i <= (int) number; i++) {
            factorialValue *= i;
        }

        return factorialValue;
    }

    // Fibonacci Series
    public void fibonacci(int terms) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    // GCD
    public int gcd(int firstNumber, int secondNumber) {

        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }

        return firstNumber;
    }

    // LCM
    public int lcm(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) /
                gcd(firstNumber, secondNumber);
    }

    // Power
    public long power(int base, int exponent) {

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    // Demonstrate Scope
    public void showScopeDifference() {

        int instanceNumber = 50; // Local Variable

        System.out.println("Local Variable = " + instanceNumber);
        System.out.println("Instance Variable = " + this.instanceNumber);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathWizard wizard = new MathWizard();

        System.out.print("Enter a number to check Prime: ");
        int primeNumber = sc.nextInt();

        System.out.println("Is Prime: " +
                wizard.isPrime(primeNumber));

        System.out.print("Enter number for Factorial: ");
        int factorialNumber = sc.nextInt();

        System.out.println("Factorial (int): " +
                wizard.factorial(factorialNumber));

        System.out.print("Enter decimal number for Factorial: ");
        double factorialDouble = sc.nextDouble();

        System.out.println("Factorial (double): " +
                wizard.factorial(factorialDouble));

        System.out.print("Enter terms for Fibonacci: ");
        int fibonacciTerms = sc.nextInt();

        wizard.fibonacci(fibonacciTerms);

        System.out.print("Enter first number for GCD/LCM: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number for GCD/LCM: ");
        int secondNumber = sc.nextInt();

        System.out.println("GCD = " +
                wizard.gcd(firstNumber, secondNumber));

        System.out.println("LCM = " +
                wizard.lcm(firstNumber, secondNumber));

        System.out.print("Enter Base: ");
        int base = sc.nextInt();

        System.out.print("Enter Exponent: ");
        int exponent = sc.nextInt();

        System.out.println("Power = " +
                wizard.power(base, exponent));

        wizard.showScopeDifference();
    }
}