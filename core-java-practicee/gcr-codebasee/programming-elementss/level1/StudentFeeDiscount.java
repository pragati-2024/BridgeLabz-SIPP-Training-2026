import java.util.Scanner;

class StudentFeeDiscount {
    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }

    public static void main(String[] args) {
        StudentFeeDiscount obj = new StudentFeeDiscount();
        obj.calculate();
    }
}