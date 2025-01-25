package services;

public abstract class BankService {
    public abstract void checkBalance();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}