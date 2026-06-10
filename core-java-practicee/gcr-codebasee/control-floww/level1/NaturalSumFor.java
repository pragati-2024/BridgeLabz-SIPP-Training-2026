import java.util.Scanner;

class NaturalSumFor {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("For Loop Sum = " + sum);
        System.out.println("Formula Sum = " + formula);
    }

    public static void main(String[] args) {
        NaturalSumFor obj = new NaturalSumFor();
        obj.calculate();
    }
}