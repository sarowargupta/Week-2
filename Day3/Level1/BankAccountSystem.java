package Day3.Level1;
import java.util.*;
class BankAccount{

    //instance variable
    private String accountHolderName;
    private final String accountNumber ;

    //class variable shared among allaccounts
    static String bankName = "State Bank Of India";
    static int Bank = 0;

    //constructor to initialize the account details
    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        Bank++;
    }

    //method to count total bank account
    public static void getTotalAccounts(){
        System.out.println("Total Bank Account: " + Bank);
    }
    //method to display to account details
    public void displayDetails(){
        System.out.println("\n AccountHolder Details");
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("BankName: " + bankName);
    }


}
public class BankAccountSystem {
    public static void main(String[] args){
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //enter accountHolder and accountNumber for first person;
        System.out.println("enter the name accountHolder");
        String accountHolderName1 = sc.nextLine();
        System.out.println("Enter account Number");
        String accountNumber1 = sc.nextLine();
       BankAccount account1 = new BankAccount(accountHolderName1,accountNumber1);

        //enter accountHolder and accountNumber for second person;
        System.out.println("enter the name accountHolder");
        String accountHolderName2 = sc.nextLine();
        System.out.println("Enter account Number");
        String accountNumber2 = sc.nextLine();
       BankAccount account2 = new BankAccount(accountHolderName2,accountNumber2);

       //check both object is instance of class Bank Account
       if(account1 instanceof BankAccount){
           System.out.println("account1 is instance of BankAccount");
           account1.displayDetails();
       }
       if(account2 instanceof BankAccount){
           System.out.println("account2 is instance of BankAccount");
           account2.displayDetails();
       }
       BankAccount.getTotalAccounts();

       //close scanner
        sc.close();

    }


}
