public class task1 {
    public static void main(String[] args) {

        
        int[] income = {8000, 12000, 25000, 60000, 45000,
                        9000, 75000, 30000, 15000, 55000};

        double totalTax = 0;
//conditon is that  5 % apply if income less than 10k here we use if else if and all
  
       for (int i = 0; i < income.length; i++) {

            double tax = 0;

            if (income[i] < 10000) {
                tax = income[i] * 0.05;
                System.out.println("Citizen " + (i + 1) +
                                   ": 5% Tax, Amount = " + tax);
            }
            else if (income[i] <= 50000) {
                tax = income[i] * 0.15;
                System.out.println("Citizen " + (i + 1) +
                                   ": 15% Tax, Amount = " + tax);
            }
            else {
                tax = income[i] * 0.30;
                System.out.println("Citizen " + (i + 1) +
                                   ": 30% Tax, Amount = " + tax);
            }

            totalTax += tax;
        }
        System.out.println("\nTotal Tax Collected = " + totalTax);
    }
}