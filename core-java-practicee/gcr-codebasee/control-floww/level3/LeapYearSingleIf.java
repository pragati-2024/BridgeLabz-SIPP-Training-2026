import java.util.Scanner;

class LeapYearSingleIf {

    void checkLeapYear() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year >= 1582 &&
            ((year % 4 == 0 && year % 100 != 0)
            || year % 400 == 0)) {

            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        LeapYearSingleIf obj = new LeapYearSingleIf();
        obj.checkLeapYear();
    }
}