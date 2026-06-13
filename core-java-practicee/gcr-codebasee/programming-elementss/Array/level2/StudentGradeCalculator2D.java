import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("Physics Marks: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry Marks: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths Marks: ");
            marks[i][2] = sc.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid Marks! Enter Again.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        System.out.println("\nPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.println(percentage[i] + "\t\t" + grade[i]);
        }
    }
}