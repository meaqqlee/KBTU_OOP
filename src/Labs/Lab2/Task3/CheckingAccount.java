package Labs.Lab2.Task3;

public class CheckingAccount extends Account {
    private int numberOfTransitions;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accNum) {
        super(accNum);
        this.numberOfTransitions = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        numberOfTransitions++;
        deductFee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
    }

    public void deductFee() {
        if(numberOfTransitions > FREE_TRANSACTIONS) {
            super.withdraw(getBalance() * TRANSACTION_FEE);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Transactions: " + numberOfTransitions;
    }
}
