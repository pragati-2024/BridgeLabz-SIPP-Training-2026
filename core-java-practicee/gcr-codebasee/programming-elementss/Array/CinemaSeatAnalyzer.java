import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Seats: ");
        int totalSeats = sc.nextInt();

        int[] seats = new int[totalSeats];

        System.out.println("Enter Seat Status (0 = Empty, 1 = Booked)");

        for (int i = 0; i < seats.length; i++) {
            seats[i] = sc.nextInt();
        }

        int bookedSeats = 0;
        int availableSeats = 0;

        int currentLength = 0;
        int longestLength = 0;

        int currentStart = 0;
        int longestStart = 0;
        int longestEnd = 0;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 1) {
                bookedSeats++;
            } else {
                availableSeats++;
            }

            if (seats[i] == 0) {

                if (currentLength == 0) {
                    currentStart = i;
                }

                currentLength++;

                if (currentLength > longestLength) {

                    longestLength = currentLength;
                    longestStart = currentStart;
                    longestEnd = i;
                }

            } else {
                currentLength = 0;
            }
        }

        System.out.println("\nBooked Seats = " + bookedSeats);
        System.out.println("Available Seats = " + availableSeats);

        System.out.println("\nLongest Available Block:");
        System.out.println("Starting Position = " + longestStart);
        System.out.println("Ending Position = " + longestEnd);

        if (longestLength >= 5) {
            System.out.println("Group of 5 can sit together.");
        } else {
            System.out.println("Group of 5 cannot sit together.");
        }
    }
}