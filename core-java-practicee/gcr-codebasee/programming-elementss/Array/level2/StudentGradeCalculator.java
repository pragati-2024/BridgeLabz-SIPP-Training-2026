import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("Physics Marks: ");
            physics[i] = sc.nextInt();

            System.out.print("Chemistry Marks: ");
            chemistry[i] = sc.nextInt();

            System.out.print("Maths Marks: ");
            maths[i] = sc.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid Marks! Enter Again.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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