import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class UC6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        input = input.toLowerCase().replaceAll("\\s+", "");

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;


        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}



MY PROJECTY IS OF DBMAS AND IT IS GOVT SCHEME ELIGIBILITY CRETARIA AND IMPCT TRACKER THERE SHOULD BE A USER AND ADMIN LOGIN SHJOUL;D BE THERE THE UI SHOULD BE LOOKING AMAZING AND MAKE THER BUTTON GLOWING WITH THE ANIMATION IN THE BACKGROUND AND IN THE BUTTON ALSO DASHBOARD SHOULD BE THERE