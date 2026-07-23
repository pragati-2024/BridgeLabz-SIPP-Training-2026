import java.util.Scanner;

public class SumNaturalNumbers {

    public static int findSum(int number) {

        if (number == 1) {
            return 1;
        }

        return number + findSum(number - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(findSum(number));
    }
}