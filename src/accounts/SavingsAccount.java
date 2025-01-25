package accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountHolderName, double initialBalance) {
        super(accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            System.out.println("Savings account withdrawal allowed: $" + amount);
            super.withdraw(amount);
        } else {
            System.out.println("Savings account withdrawal failed.");
        }
    }
}