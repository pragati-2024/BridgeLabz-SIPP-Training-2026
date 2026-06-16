import java.util.Scanner;

public class ConsecutiveSensorReadings {

    public static boolean isIncreasing(
            int[] readings,
            int index) {

        if (index == readings.length - 1) {
            return true;
        }

        if (readings[index] >= readings[index + 1]) {
            return false;
        }

        return isIncreasing(readings, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Readings: ");
        int size = sc.nextInt();

        int[] readings = new int[size];

        for (int i = 0; i < size; i++) {
            readings[i] = sc.nextInt();
        }

        System.out.println(
                "Strictly Increasing: " +
                isIncreasing(readings, 0));
    }
}