import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {

            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        try {

            System.out.println(names[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }
    }
}