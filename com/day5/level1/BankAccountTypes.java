package com.day5.level1;
class BankAccount {
    //attribute
    private String accountNumber;
    private double balance;

    // Constructor to initialize Bank Account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Details: ");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    //attribute
    private double interestRate;

    // Constructor to initialize saving account details
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayAccountDetails() {
        // Call superclass method
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    //attribute
    private double withdrawalLimit;

    // Constructor to initialize CheckingAccount details
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call to superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }


    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayAccountDetails() {
        // Call superclass method
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    // Term in months
    private int depositTerm;

    // Constructor to initialize fixed deposit account details
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }


    @Override
    public void displayAccountDetails() {
        // Call superclass method
        super.displayAccountDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000, 2.5);
        savingsAccount.displayAccountType();
        savingsAccount.displayAccountDetails();
        System.out.println();

        // Create a CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 3000, 1000);
        checkingAccount.displayAccountType();
        checkingAccount.displayAccountDetails();
        System.out.println();

        // Create a FixedDepositAccount
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 10000, 12);
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayAccountDetails();
    }
}

