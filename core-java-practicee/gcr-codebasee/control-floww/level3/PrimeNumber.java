import java.util.Scanner;

class PrimeNumber {

    void checkPrime() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.checkPrime();
    }
}