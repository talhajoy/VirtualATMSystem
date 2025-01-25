package main;

import accounts.Account;
import accounts.SavingsAccount;
import accounts.CurrentAccount;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Create sample accounts
        Account savingsAccount = new SavingsAccount("Alice", 1000);
        Account currentAccount = new CurrentAccount("Bob", 500, 200);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Virtual ATM!");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Select account type: ");
        int choice = scanner.nextInt();

        Account selectedAccount = (choice == 1) ? savingsAccount : currentAccount;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> selectedAccount.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    selectedAccount.deposit(depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    selectedAccount.withdraw(withdrawAmount);
                }
                case 4 -> {
                    System.out.println("Thank you for using the Virtual ATM!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}