import java.util.Scanner;

public class TowerOfHanoi {

    public static void solveHanoi(
            int disks,
            char source,
            char auxiliary,
            char destination) {

        if (disks == 1) {

            System.out.println(
                    "Move disk 1 from "
                            + source
                            + " to "
                            + destination);

            return;
        }

        solveHanoi(
                disks - 1,
                source,
                destination,
                auxiliary);

        System.out.println(
                "Move disk "
                        + disks
                        + " from "
                        + source
                        + " to "
                        + destination);

        solveHanoi(
                disks - 1,
                auxiliary,
                source,
                destination);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int disks = sc.nextInt();

        solveHanoi(
                disks,
                'A',
                'B',
                'C');
    }
}