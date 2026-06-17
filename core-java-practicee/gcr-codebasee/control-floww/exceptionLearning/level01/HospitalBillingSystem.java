import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processBill(String itemsInput, int patientIndex, int[] patients, double amountPaid)
            throws InsufficientFundsException {

        try {
            int items = Integer.parseInt(itemsInput);

            double billAmount = 1000.0 / items; // May cause ArithmeticException

            System.out.println("Patient ID: " + patients[patientIndex]);

            if (amountPaid < billAmount) {
                throw new InsufficientFundsException(
                        "Payment Failed! Required ₹" + billAmount +
                        ", Paid ₹" + amountPaid);
            }

            System.out.println("Bill Paid Successfully.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
    }

    public static void main(String[] args) {
        int[] patients = {101, 102, 103};

        try {
            processBill("0", 1, patients, 500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}