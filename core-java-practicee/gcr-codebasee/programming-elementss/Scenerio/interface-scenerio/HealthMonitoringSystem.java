interface HeartRateMonitor {

    void monitorHeartRate();

    default void displayHealthTips() {
        System.out.println("Exercise regularly.");
    }
}

interface TemperatureMonitor {

    void monitorTemperature();

    default void displayHealthTips() {
        System.out.println("Stay hydrated.");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.startsWith("PAT")
                && patientId.length() == 6;
    }
}

public class HealthMonitoringSystem
        implements HeartRateMonitor, TemperatureMonitor {

    @Override
    public void monitorHeartRate() {
        System.out.println("Heart Rate: 75 BPM");
    }

    @Override
    public void monitorTemperature() {
        System.out.println("Temperature: 98.6°F");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public static void main(String[] args) {

        String[] patientNames = {
                "Amit",
                "Neha",
                "Rohit"
        };

        String[] patientIds = {
                "PAT01",
                "P1234",
                "PAT99"
        };

        HealthMonitoringSystem system =
                new HealthMonitoringSystem();

        system.displayHealthTips();

        System.out.println("\nPatient Report:");

        for (int i = 0; i < patientNames.length; i++) {

            System.out.println("\nPatient: "
                    + patientNames[i]);

            if (TemperatureMonitor
                    .isPatientIdValid(patientIds[i])) {

                System.out.println("Valid Patient ID");
                system.monitorHeartRate();
                system.monitorTemperature();
                System.out.println("Status: Healthy");
            } else {
                System.out.println("Invalid Patient ID");
            }
        }
    }
}