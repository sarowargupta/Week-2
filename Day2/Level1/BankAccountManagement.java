package Day2.Level1;
import java.util.*;
// BankAccount class
class BankAccount {
    // Instance Variables
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor to initialize BankAccount object
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class (Subclass of BankAccount)
class SavingsAccount extends BankAccount {

    // Constructor to initialize SavingsAccount object
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        // Call the constructor of the superclass (BankAccount)
        super(accountNumber, accountHolder, balance);
    }

    // Method to access account number and account holder (from BankAccount class)
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        // Accessing public variable
        System.out.println("Account Number: " + accountNumber);
        // Accessing protected variable
        System.out.println("Account Holder: " + accountHolder);
        // Accessing balance using getter method
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount("1234567890", "John Doe", 1500.50);

        // Display account details
        account1.displayAccountDetails();

        // Modify the balance using the setter method
        System.out.print("Enter new balance for the account: ");
        double newBalance = 2000.75;  // Here you could use Scanner for dynamic input if needed
        account1.setBalance(newBalance);
        System.out.println("Updated Account Details:");
        account1.displayAccountDetails();

        System.out.println();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount1 = new SavingsAccount("0987654321", "Jane Smith", 3000.00);

        // Display savings account details
        savingsAccount1.displaySavingsAccountDetails();
    }
}

