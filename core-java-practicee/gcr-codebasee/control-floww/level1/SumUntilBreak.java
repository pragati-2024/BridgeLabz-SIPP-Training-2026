import java.util.Scanner;

class SumUntilBreak {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        while (true) {
            System.out.print("Enter number: ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("Total Sum = " + total);
    }

    public static void main(String[] args) {
        SumUntilBreak obj = new SumUntilBreak();
        obj.calculate();
    }
}