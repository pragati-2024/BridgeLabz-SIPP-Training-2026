import java.util.Scanner;

class MultiplesBelow100For {

    void display() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i = number; i < 100; i += number) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultiplesBelow100For obj = new MultiplesBelow100For();
        obj.display();
    }
}