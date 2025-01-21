package Day1.Level2;
import java.util.*;
class PalindromeChecker {

    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Normalize the string: remove spaces and convert to lowercase
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedText.length();

        // Check for palindrome
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text " + text + " is a palindrome.");
        } else {
            System.out.println("The text " + text + " is not a palindrome.");
        }
    }
}
public class PalindromeCheck {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter text to check if it's a palindrome: ");
        String inputText = sc.nextLine();

        // Create a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(inputText);

        // Display the result
        checker.displayResult();

        //close scanner
        sc.close();
    }
}



