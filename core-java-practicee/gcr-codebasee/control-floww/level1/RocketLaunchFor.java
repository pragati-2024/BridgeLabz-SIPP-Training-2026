import java.util.Scanner;

class RocketLaunchFor {

    void countdown() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");
    }

    public static void main(String[] args) {
        RocketLaunchFor obj = new RocketLaunchFor();
        obj.countdown();
    }
}