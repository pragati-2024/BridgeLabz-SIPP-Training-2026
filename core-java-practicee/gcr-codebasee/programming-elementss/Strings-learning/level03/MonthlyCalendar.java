import java.util.Scanner;

public class MonthlyCalendar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i <= 30; i++) {

            System.out.printf("%3d ", i);

            if (i % 7 == 0)
                System.out.println();
        }
    }
}