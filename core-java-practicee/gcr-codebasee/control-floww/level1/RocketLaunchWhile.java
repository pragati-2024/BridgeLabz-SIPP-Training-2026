import java.util.Scanner;

class RocketLaunchWhile {

    void countdown() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launched!");
    }

    public static void main(String[] args) {
        RocketLaunchWhile obj = new RocketLaunchWhile();
        obj.countdown();
    }
}