import java.util.Scanner;

class FizzBuzzWhile {

    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int i = 1;

        while(i <= number) {

            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

            i++;
        }
    }

    public static void main(String[] args) {
        FizzBuzzWhile obj = new FizzBuzzWhile();
        obj.display();
    }
}