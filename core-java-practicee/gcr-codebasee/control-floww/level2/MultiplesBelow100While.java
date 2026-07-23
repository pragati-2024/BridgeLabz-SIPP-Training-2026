import java.util.Scanner;

class MultiplesBelow100While {

    void display() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int multiple = number;

        while(multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }
    }

    public static void main(String[] args) {
        MultiplesBelow100While obj = new MultiplesBelow100While();
        obj.display();
    }
}