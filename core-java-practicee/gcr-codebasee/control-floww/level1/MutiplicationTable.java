import java.util.Scanner;

class MultiplicationTable {

    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i +
                    " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.display();
    }
}