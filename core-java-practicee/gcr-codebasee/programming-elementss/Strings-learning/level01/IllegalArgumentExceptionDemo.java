import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        try {

            int start = 5;
            int end = 2;

            String result = text.substring(start, end);

            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled");
        }
    }
}