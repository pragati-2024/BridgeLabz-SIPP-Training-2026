import java.util.Scanner;

public class FactorialRecursion {

    public static long factorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(factorial(number));
    }
}