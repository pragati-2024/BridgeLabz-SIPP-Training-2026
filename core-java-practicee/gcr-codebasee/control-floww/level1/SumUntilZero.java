import java.util.Scanner;

class SumUntilZero {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double number;

        System.out.print("Enter number: ");
        number = sc.nextDouble();

        while (number != 0) {
            total += number;

            System.out.print("Enter number: ");
            number = sc.nextDouble();
        }

        System.out.println("Total Sum = " + total);
    }

    public static void main(String[] args) {
        SumUntilZero obj = new SumUntilZero();
        obj.calculate();
    }
}