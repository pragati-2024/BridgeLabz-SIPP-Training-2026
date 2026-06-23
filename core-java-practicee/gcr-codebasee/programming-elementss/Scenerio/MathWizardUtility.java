public class MathWizardUtility {

    int instanceVar = 100;

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded factorial
    public static double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    void demonstrateScope() {
        int instanceVar = 50;

        System.out.println("Local Variable: " + instanceVar);
        System.out.println("Instance Variable: " + this.instanceVar);
    }

    public static void main(String[] args) {

        System.out.println(isPrime(17));
        System.out.println(factorial(5));
        System.out.println(factorial(5.0));
        System.out.println(fibonacci(7));
        System.out.println(gcd(12, 18));
        System.out.println(lcm(12, 18));
        System.out.println(power(2, 5));

        new MathWizardUtility().demonstrateScope();
    }
}