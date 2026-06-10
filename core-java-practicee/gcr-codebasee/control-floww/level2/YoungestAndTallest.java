import java.util.Scanner;

class YoungestAndTallest {

    void check() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony height: ");
        double anthonyHeight = sc.nextDouble();

        if(amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest = Amar");
        else if(akbarAge < anthonyAge)
            System.out.println("Youngest = Akbar");
        else
            System.out.println("Youngest = Anthony");

        if(amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest = Amar");
        else if(akbarHeight > anthonyHeight)
            System.out.println("Tallest = Akbar");
        else
            System.out.println("Tallest = Anthony");
    }

    public static void main(String[] args) {
        YoungestAndTallest obj = new YoungestAndTallest();
        obj.check();
    }
}