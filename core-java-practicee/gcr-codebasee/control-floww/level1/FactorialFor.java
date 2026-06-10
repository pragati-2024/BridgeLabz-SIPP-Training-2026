import java.util.Scanner;

class FactorialFor {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);
    }

    public static void main(String[] args) {
        FactorialFor obj = new FactorialFor();
        obj.calculate();
    }
}