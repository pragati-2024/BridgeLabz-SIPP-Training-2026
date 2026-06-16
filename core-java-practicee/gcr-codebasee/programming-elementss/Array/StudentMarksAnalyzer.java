import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int numberOfStudents = sc.nextInt();

        int[] marks = new int[numberOfStudents];

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int countAbove75 = 0;
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter Marks of Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] > 75) {
                countAbove75++;
            }

            sum += marks[i];
        }

        double average = (double) sum / numberOfStudents;

        System.out.println("\nHighest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);
        System.out.println("Students Above 75 = " + countAbove75);
        System.out.println("Average Marks = " + average);

        System.out.println("\nMarks Greater Than Average:");

        for (int mark : marks) {
            if (mark > average) {
                System.out.print(mark + " ");
            }
        }
    }
}