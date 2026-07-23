import java.util.Scanner;

public class BMITeamTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < number; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.println(height[i] + "\t" +
                               weight[i] + "\t" +
                               bmi[i] + "\t" +
                               status[i]);
        }
    }
}