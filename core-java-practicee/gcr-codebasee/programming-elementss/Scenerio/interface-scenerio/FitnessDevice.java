interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity logged: 5000 steps");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report Generated");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Daily goal not completed!");
    }

    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("\nJava supports multiple interface implementation.");
        System.out.println("A class can implement Trackable, Reportable and Notifiable together.");
    }
}