package com.day6.level1;
// Abstract Class: BankAccount
abstract class BankAccount {
    //attribute
    private int accountNumber;
    private String holderName;
    private double balance;

    //constructor to initialize bank account details
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    //getter and setter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //concrete method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    //abstract method to calculate Interest
    public abstract double calculateInterest();

    //method to display details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface: Loanable
interface Loanable {
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    //constructor to initialize saving account details
    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    //getter and setter
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application for Savings Account submitted: Amount " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;  // Loan eligibility is 2 times the balance
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    //constructor to initialize current account details
    public CurrentAccount(int accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    //getter and setter
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setInterestRate(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application for Current Account submitted: Amount " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit; // Example eligibility criteria
    }
}

// Main class showcasing polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        //BankAccount reference contains object of subclass
        BankAccount savingsAccount = new SavingsAccount(101, "Alice", 50000, 4);
        BankAccount currentAccount = new CurrentAccount(102, "Bob", 30000, 10000);

        BankAccount[] accounts = {savingsAccount, currentAccount};

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(20000);
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}






