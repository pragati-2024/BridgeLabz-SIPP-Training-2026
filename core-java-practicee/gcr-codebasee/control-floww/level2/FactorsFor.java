import java.util.Scanner;

class FactorsFor {

    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FactorsFor obj = new FactorsFor();
        obj.display();
    }
}