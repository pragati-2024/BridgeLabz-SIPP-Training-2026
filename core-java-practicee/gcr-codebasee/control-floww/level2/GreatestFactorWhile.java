import java.util.Scanner;

class GreatestFactorWhile {

    void findFactor() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;

        while(counter >= 1) {

            if(number % counter == 0) {
                greatestFactor = counter;
                break;
            }

            counter--;
        }

        System.out.println(greatestFactor);
    }

    public static void main(String[] args) {
        GreatestFactorWhile obj = new GreatestFactorWhile();
        obj.findFactor();
    }
}