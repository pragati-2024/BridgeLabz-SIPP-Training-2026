import java.util.Scanner;

class FactorsWhile {

    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int i = 1;

        while(i <= number) {

            if(number % i == 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    public static void main(String[] args) {
        FactorsWhile obj = new FactorsWhile();
        obj.display();
    }
}