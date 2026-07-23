import java.util.Scanner;

class VotingEligibility {

    void check() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is "
                    + age + " and can vote.");
        } else {
            System.out.println("The person's age is "
                    + age + " and cannot vote.");
        }
    }

    public static void main(String[] args) {
        VotingEligibility obj = new VotingEligibility();
        obj.check();
    }
}