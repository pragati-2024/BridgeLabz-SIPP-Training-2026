import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            System.out.println(text.charAt(100));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }
}