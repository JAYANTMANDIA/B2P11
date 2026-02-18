

public class UC4PalindromeChecker {


    public static void main(String[] args) {


        String input = "radar";


        char[] characters=input.toCharArray();


        int start = 0;
         int end=characters.length - 1;

        boolean isPalindrome = true;


        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }


        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result       : Palindrome");
        } else {
            System.out.println("Result       : Not a Palindrome");
        }
    }
}
