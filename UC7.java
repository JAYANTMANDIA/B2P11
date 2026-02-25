import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * UC7: Deque-Based Optimized Palindrome Checker
 * Goal: Use Deque to compare front and rear elements.
 */

public class UC7 {

    // Method to check palindrome using Deque
    public static boolean isPalindrome(String input) {

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Convert string to lowercase and remove spaces
        input = input.toLowerCase().replaceAll("\\s+", "");

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear elements
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Deque-Based Palindrome Checker (UC7) ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome ✅");
        } else {
            System.out.println("Result: The string is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}





in the project its direct login ther should be login interface and make ui ux more attractive and give the files the login interface should hav animation in the bg email password should be asked then the dashord interface should be shown