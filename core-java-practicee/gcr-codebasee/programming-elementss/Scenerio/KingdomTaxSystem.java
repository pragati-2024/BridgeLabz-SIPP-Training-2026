public class KingdomTaxSystem {

    public static void main(String[] args) {

        double[] incomes = {
                8000, 12000, 25000, 55000, 70000,
                9500, 40000, 52000, 15000, 90000
        };

        double totalTaxCollected = 0;

        for (int i = 0; i < incomes.length; i++) {

            double income = incomes[i];
            double tax = 0;

            if (income < 10000) {
                tax = income * 0.05;
                System.out.println("Citizen " + (i + 1)
                        + " -> Income: " + income
                        + " | Tax Bracket: 5%"
                        + " | Tax Amount: " + tax);
            } else if (income <= 50000) {
                tax = income * 0.15;
                System.out.println("Citizen " + (i + 1)
                        + " -> Income: " + income
                        + " | Tax Bracket: 15%"
                        + " | Tax Amount: " + tax);
            } else {
                tax = income * 0.30;
                System.out.println("Citizen " + (i + 1)
                        + " -> Income: " + income
                        + " | Tax Bracket: 30%"
                        + " | Tax Amount: " + tax);
            }

            totalTaxCollected += tax;
        }

        System.out.println("\nTotal Tax Collected = " + totalTaxCollected);
    }
}