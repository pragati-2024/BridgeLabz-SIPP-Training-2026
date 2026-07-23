class InsufficientBalanceException extends Exception {

    private double balance;
    private double withdrawalAmount;

    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance!");
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public String getMessage() {
        return "Insufficient Balance! Available: ₹" + balance +
               ", Requested: ₹" + withdrawalAmount;
    }
}

public class ATMWithdrawalSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance: ₹" + (balance - amount));
    }

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawAmount = 8000;

        try {
            withdraw(balance, withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}