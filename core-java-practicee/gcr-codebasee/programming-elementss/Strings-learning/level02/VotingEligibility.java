import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {

        Random random = new Random();

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;
        }

        return ages;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        System.out.println("Age\tCan Vote");

        for (int age : ages) {
            System.out.println(age + "\t" + (age >= 18));
        }

        sc.close();
    }
}