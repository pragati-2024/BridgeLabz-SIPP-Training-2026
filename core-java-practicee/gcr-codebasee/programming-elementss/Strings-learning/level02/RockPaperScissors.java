import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int num = (int) (Math.random() * 3);

        if (num == 0)
            return "Rock";
        if (num == 1)
            return "Paper";

        return "Scissors";
    }

    public static String winner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();

            String computer = computerChoice();

            String result = winner(user, computer);

            System.out.println("Computer: " + computer);
            System.out.println("Winner: " + result);

            if (result.equals("User"))
                userWins++;
            else if (result.equals("Computer"))
                computerWins++;
        }

        double userPercent = (userWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        System.out.println("\nUser Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);

        System.out.println("User Win %: " + userPercent);
        System.out.println("Computer Win %: " + computerPercent);

        sc.close();
    }
}