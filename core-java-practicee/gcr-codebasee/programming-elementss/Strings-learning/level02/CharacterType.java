import java.util.Scanner;

public class CharacterType {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + 32);

        if ("aeiou".indexOf(ch) != -1)
            return "Vowel";

        if (ch >= 'a' && ch <= 'z')
            return "Consonant";

        return "Not a Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        System.out.println("Character\tType");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "\t\t" +
                    checkCharacter(text.charAt(i)));
        }

        sc.close();
    }
}