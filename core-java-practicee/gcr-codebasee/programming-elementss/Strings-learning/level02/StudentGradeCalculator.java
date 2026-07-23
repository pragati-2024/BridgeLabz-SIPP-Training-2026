import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static String grade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < n; i++) {

            int phy = random.nextInt(100);
            int chem = random.nextInt(100);
            int math = random.nextInt(100);

            int total = phy + chem + math;
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%s\n",
                    phy, chem, math, total, avg, per,
                    grade(per));
        }

        sc.close();
    }
}