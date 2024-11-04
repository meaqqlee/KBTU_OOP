package Labs.Lab2.Task3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create test accounts
        SavingAccount savings1 = new SavingAccount(1, 2.5);  // 2.5% interest
        CheckingAccount checking1 = new CheckingAccount(2);

        // Open accounts
        bank.openAccount(savings1);
        bank.openAccount(checking1);

        // Perform transactions
        savings1.deposit(1000);
        checking1.deposit(500);
        checking1.withdraw(100);

        // Update accounts
        bank.updateAccount();

        // Print account details
        bank.printAllAccounts();
    }
}