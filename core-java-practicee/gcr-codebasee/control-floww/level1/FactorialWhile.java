import java.util.Scanner;

class FactorialWhile {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
    }

    public static void main(String[] args) {
        FactorialWhile obj = new FactorialWhile();
        obj.calculate();
    }
}