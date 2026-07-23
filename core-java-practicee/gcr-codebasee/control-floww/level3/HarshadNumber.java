import java.util.Scanner;

class HarshadNumber {

    void checkHarshad() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        while (temp != 0) {

            sum += temp % 10;

            temp /= 10;
        }

        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }

    public static void main(String[] args) {
        HarshadNumber obj = new HarshadNumber();
        obj.checkHarshad();
    }
}