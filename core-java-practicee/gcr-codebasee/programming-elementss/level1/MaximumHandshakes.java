import java.util.Scanner;

class MaximumHandshakes {
    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }

    public static void main(String[] args) {
        MaximumHandshakes obj = new MaximumHandshakes();
        obj.calculate();
    }
}