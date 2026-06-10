import java.util.Scanner;

class ArmstrongNumber {

    void checkArmstrong() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {

            int digit = originalNumber % 10;

            sum += digit * digit * digit;

            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.checkArmstrong();
    }
}