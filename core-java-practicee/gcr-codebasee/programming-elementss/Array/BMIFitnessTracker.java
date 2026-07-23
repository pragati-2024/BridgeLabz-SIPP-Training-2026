import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
// Maya, a fitness coach, wants to record the BMI of her clients.
// ●              Ask for height and weight.
// ●              Use formula BMI = weight / (height * height)
// ●              Print category using if-else: Underweight, Normal, Overweight.
 
// Use clear variable names and comments to maintain code hygiene.

        Scanner sc = new Scanner(System.in);

        // Input height in meters
        System.out.print("Enter height (in meters): ");
        double height = sc.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI
        System.out.println("BMI = " + bmi);

        // Check BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}