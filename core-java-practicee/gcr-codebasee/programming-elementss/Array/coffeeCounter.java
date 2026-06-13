import java.util.*;
public class coffeeCounter {
    // Ravi runs a café. Each customer orders different coffee types with
    // quantities. Write a program that:
    // ● Asks for coffee type (switch)
    // ● Calculates total bill (price * quantity)
    // ● Adds GST using arithmetic operators

    // Use while to continue for the next customer and break when "exit" is typed.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter coffee type (espresso/latte/cappuccino/exit): ");
            String coffee = sc.next();

            int price = 0;

            switch (coffee) {
                case "espresso":
                    price = 100;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 200;
                    break;

                case "exit":
                    return;

                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double bill = price * quantity;
            double gst = bill * 18 / 100;
            double totalBill = bill + gst;

            System.out.println("Bill = " + bill);
            System.out.println("GST = " + gst);
            System.out.println("Total Bill = " + totalBill);
        }
    }
}
