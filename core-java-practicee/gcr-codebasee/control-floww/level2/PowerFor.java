import java.util.Scanner;

class PowerFor {

    void calculate() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        PowerFor obj = new PowerFor();
        obj.calculate();
    }
}