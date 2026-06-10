import java.util.Scanner;

class DayOfWeek {

    void findDay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month: ");
        int m = sc.nextInt();

        System.out.print("Enter Day: ");
        int d = sc.nextInt();

        System.out.print("Enter Year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int day = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of Week = " + day);
    }

    public static void main(String[] args) {
        DayOfWeek obj = new DayOfWeek();
        obj.findDay();
    }
}