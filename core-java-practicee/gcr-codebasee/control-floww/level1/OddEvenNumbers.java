import java.util.Scanner;

class OddEvenNumbers {

    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }

    public static void main(String[] args) {
        OddEvenNumbers obj = new OddEvenNumbers();
        obj.display();
    }
}