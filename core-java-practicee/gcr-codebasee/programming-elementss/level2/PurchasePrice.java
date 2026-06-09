import java.util.Scanner;

class PurchasePrice {
    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPrice + " if the quantity "
                + quantity + " and unit price is INR " + unitPrice);
    }

    public static void main(String[] args) {
        PurchasePrice obj = new PurchasePrice();
        obj.calculate();
    }
}