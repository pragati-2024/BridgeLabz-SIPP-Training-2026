import java.util.Scanner;

class CalculatorSwitch {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        String op = sc.next();

        switch (op) {

            case "+":
                System.out.println(first + second);
                break;

            case "-":
                System.out.println(first - second);
                break;

            case "*":
                System.out.println(first * second);
                break;

            case "/":
                System.out.println(first / second);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }

    public static void main(String[] args) {
        CalculatorSwitch obj = new CalculatorSwitch();
        obj.calculate();
    }
}