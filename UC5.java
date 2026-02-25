import java.util.Scanner;
import java.util.Stack;

public class UC5 {

    public static boolean isPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }


        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC5: Stack-Based Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: The string is a Palindrome ✅");
        } else {
            System.out.println("Result: The string is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}