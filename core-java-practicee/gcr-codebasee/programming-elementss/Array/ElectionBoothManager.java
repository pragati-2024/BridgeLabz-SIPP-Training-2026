import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {

        // .  Election Booth Manager 🗳
// Design a polling booth system.
// ●              Take age input.
// ●              Use if to check if eligible (>=18).
// ●              Record vote (1, 2, or 3 for candidates).
// ●              Loop for multiple voters, exit on special code.
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age >= 18) {

                System.out.println("Choose Candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                int vote = sc.nextInt();

                if (vote == 1) {
                    System.out.println("Vote recorded for Candidate A");
                } else if (vote == 2) {
                    System.out.println("Vote recorded for Candidate B");
                } else if (vote == 3) {
                    System.out.println("Vote recorded for Candidate C");
                } else {
                    System.out.println("Invalid Vote");
                }

            } else {
                System.out.println("Not eligible to vote");
            }
        }

        System.out.println("Polling Booth Closed");
        sc.close();
    }
}