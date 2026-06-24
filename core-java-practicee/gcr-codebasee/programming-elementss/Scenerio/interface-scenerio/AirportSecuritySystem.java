interface LuggageScanner {

    boolean scanLuggage(String passengerName);

    default void displaySecurityGuidelines() {
        System.out.println("Do not carry prohibited items.");
    }
}

interface PassportVerifier {

    boolean verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Carry a valid passport and boarding pass.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 8;
    }
}

public class AirportSecuritySystem
        implements LuggageScanner, PassportVerifier {

    @Override
    public boolean scanLuggage(String passengerName) {
        return true;
    }

    @Override
    public boolean verifyPassport(String passportNo) {
        return PassportVerifier.isPassportNumberValid(passportNo);
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public static void main(String[] args) {

        String[] passengers = {
                "Pragati",
                "Rahul",
                "Aman"
        };

        String[] passportNumbers = {
                "AB123456",
                "XY12",
                "CD987654"
        };

        AirportSecuritySystem security =
                new AirportSecuritySystem();

        security.displaySecurityGuidelines();

        System.out.println("\nBoarding Status:");

        for (int i = 0; i < passengers.length; i++) {

            boolean passportValid =
                    security.verifyPassport(passportNumbers[i]);

            boolean luggageClear =
                    security.scanLuggage(passengers[i]);

            if (passportValid && luggageClear) {
                System.out.println(passengers[i]
                        + " -> Allowed to Board");
            } else {
                System.out.println(passengers[i]
                        + " -> Boarding Denied");
            }
        }
    }
}