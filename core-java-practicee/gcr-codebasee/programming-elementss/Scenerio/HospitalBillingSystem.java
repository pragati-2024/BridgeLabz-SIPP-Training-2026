import java.util.InputMismatchException;
import java.util.Scanner;

public class HospitalBillingSystem {

    static void calculateBill(int amount,
                              int items)
            throws ArithmeticException {

        System.out.println(amount / items);
    }

    static void processPayment(int balance,
                               int bill)
            throws InsufficientFundsException {

        if (bill > balance) {
            throw new InsufficientFundsException(
                    "Insufficient balance!");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        try {
            calculateBill(1000, 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }

        try {
            int[] patients = new int[5];
            System.out.println(patients[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index!");
        }

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }

        try {
            processPayment(5000, 7000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}