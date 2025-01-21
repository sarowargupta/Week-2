package Day1.Level2;


import java.util.*;
class BankAccount {
    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Unable to withdraw.");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSimulation {
    public static void main(String[] args) {

        //create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ofaccount holder");
        String accountHolder = sc.nextLine();
        System.out.println("Enter account number");
        String accountNumber = sc.nextLine();
        System.out.println("Enter balance");
        double balane = sc.nextDouble();

        // Create a sample BankAccount object
        BankAccount account = new BankAccount(accountHolder,accountNumber,balane);

        int choice = 0;

        while (choice != 4) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        //close scanner
        sc.close();
    }

}
