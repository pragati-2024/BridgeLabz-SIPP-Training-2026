import java.util.Scanner;

class DistanceConverter {
    void convert() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is "
                + yards + " while the distance in miles is " + miles);
    }

    public static void main(String[] args) {
        DistanceConverter obj = new DistanceConverter();
        obj.convert();
    }
}