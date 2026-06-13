import java.util.Scanner;

public class CustomTrim {

    public static String customTrim(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ')
            start++;

        while (end >= start && str.charAt(end) == ' ')
            end--;

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String custom = customTrim(text);
        String builtIn = text.trim();

        System.out.println("Custom Trim: " + custom);
        System.out.println("Built-in Trim: " + builtIn);
        System.out.println("Equal: " + custom.equals(builtIn));

        sc.close();
    }
}