import java.util.Scanner;

class SquareSide {
    void findSide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side + " whose perimeter is " + perimeter);
    }

    public static void main(String[] args) {
        SquareSide obj = new SquareSide();
        obj.findSide();
    }
}