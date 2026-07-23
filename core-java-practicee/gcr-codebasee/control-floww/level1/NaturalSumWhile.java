import java.util.Scanner;

class NaturalSumWhile {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("While Sum = " + sum);
        System.out.println("Formula Sum = " + formula);
    }

    public static void main(String[] args) {
        NaturalSumWhile obj = new NaturalSumWhile();
        obj.calculate();
    }
}