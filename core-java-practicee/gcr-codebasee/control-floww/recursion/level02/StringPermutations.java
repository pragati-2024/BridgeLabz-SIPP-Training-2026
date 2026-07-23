public class StringPermutations {

    public static void generatePermutations(
            String text,
            String result) {

        if (text.length() == 0) {

            System.out.println(result);
            return;
        }

        for (int i = 0; i < text.length(); i++) {

            char currentCharacter =
                    text.charAt(i);

            String remainingString =
                    text.substring(0, i)
                            + text.substring(i + 1);

            generatePermutations(
                    remainingString,
                    result + currentCharacter);
        }
    }

    public static void main(String[] args) {

        String text = "ABC";

        generatePermutations(
                text,
                "");
    }
}