import java.util.Scanner;

public class WarehouseStockRecoverySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Products: ");
        int numberOfProducts = sc.nextInt();

        int[] stock = new int[numberOfProducts];

        int zeroPosition = -1;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < stock.length; i++) {

            System.out.print("Enter Stock of Product " + (i + 1) + ": ");
            stock[i] = sc.nextInt();

            if (stock[i] == 0) {
                zeroPosition = i;
            } else {
                sum += stock[i];
                count++;
            }
        }

        int averageStock = sum / count;

        stock[zeroPosition] = averageStock;

        System.out.println("\nMissing Stock Found At Position: "
                + (zeroPosition + 1));

        System.out.println("Average Stock = " + averageStock);

        System.out.println("\nUpdated Inventory:");

        for (int quantity : stock) {
            System.out.print(quantity + " ");
        }
    }
}