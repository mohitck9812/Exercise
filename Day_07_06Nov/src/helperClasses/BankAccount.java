package helperClasses;

import customeException.InsufficientFundsException;
import customeException.InvalidAmountException;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount(String accountHolder, double initialBalance) throws InvalidAmountException {
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountNumber = ++totalAccounts;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Rs " + amount + " deposited successfully. Current Balance: Rs " + balance);
    }
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdraw amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Rs " + amount + " withdrawn successfully. Current Balance: Rs " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber +
                ", Holder: " + accountHolder +
                ", Balance: Rs " + balance);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
