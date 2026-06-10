import java.util.Scanner;

class PowerWhile {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while(counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        PowerWhile obj = new PowerWhile();
        obj.calculate();
    }
}