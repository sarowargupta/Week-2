import java.util.ArrayList;
import java.util.List;
class Account {
    //attribute
    private int accountNumber;
    private double balance;

    // Constructor to initialize the account details
    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
}

class Customers {
    //attribute
    private String name;
    private List<Account> accounts;

    // Constructor to initialize customer details
    public Customers(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to view all account balances
    public void viewBalances() {
        System.out.println("Balances for customer: " + name);
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Bank {
    //attribute
    private String bankName;
    private List<Customers> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customers customer, int accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for customer: " + customer.getName() + ", Account Number: " + accountNumber);
    }

    // Method to list all customers
    public void listCustomers() {
        System.out.println("Customers at " + bankName + ":");
        for (Customers customer : customers) {
            System.out.println(customer.getName());
        }
    }

    public String getName() {
        return bankName;
    }
}

public class BankAndAccountHolders{
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("National Bank");

        // Create customers
        Customers customer1 = new Customers("Sarowar");
        Customers customer2 = new Customers("Gupta");

        // Open accounts for customers
        bank.openAccount(customer1, 1001, 500.0);
        bank.openAccount(customer1, 1002, 1500.0);
        bank.openAccount(customer2, 2001, 1000.0);

        // List all customers in the bank
        bank.listCustomers();

        // Customers view their account balances
        customer1.viewBalances();
        customer2.viewBalances();
    }
}
