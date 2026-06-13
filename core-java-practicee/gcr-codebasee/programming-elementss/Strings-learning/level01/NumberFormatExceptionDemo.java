import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        try {

            int number = Integer.parseInt(text);

            System.out.println("Number = " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        }
    }
}