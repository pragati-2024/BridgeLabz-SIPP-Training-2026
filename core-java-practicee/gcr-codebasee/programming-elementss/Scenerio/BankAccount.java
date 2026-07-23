public class BankAccount {

    private int acc_number;
    private int balance;
    private String holder_name;

    static int totalAccounts = 0;

    BankAccount(int acc_number, int balance, String holder_name) {
        this.acc_number = acc_number;
        this.balance = balance;
        this.holder_name = holder_name;
        totalAccounts++;
    }

    void depositMoney(int amount) {
        balance += amount;
        System.out.println(amount + " deposited");
    }

    void withdrawMoney(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number : " + acc_number);
        System.out.println("Holder Name    : " + holder_name);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount(1234677, 5000, "Pragati Bansal");
        BankAccount obj2 = new BankAccount(1562977, 10000, "Reshu");
        BankAccount obj3 = new BankAccount(4342977, 8000, "Rishu");

        // 5 transactions on obj1
        obj1.depositMoney(1000);
        obj1.withdrawMoney(500);
        obj1.depositMoney(2000);
        obj1.withdrawMoney(1000);
        obj1.depositMoney(500);

        obj1.getStatement();

        System.out.println("\nTotal Accounts Created : " + totalAccounts);
    }
}