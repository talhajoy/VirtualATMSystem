package accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            System.out.println("Current account withdrawal allowed: $" + amount);
            super.withdraw(amount);
        } else {
            System.out.println("Current account withdrawal exceeds overdraft limit.");
        }
    }
}