package Labs.Lab2.Task3;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accNum, double interestRate) {
        super(accNum);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}
