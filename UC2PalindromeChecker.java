
public class UC2PalindromeChecker {


    public static void main(String[] args) {


        String input = "madam";


        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }


        if (input.equals(reverse)) {
            System.out.println("Input String : " + input);
            System.out.println("Result       : Palindrome");
        } else {
            System.out.println("Input String : " + input);
            System.out.println("Result       : Not a Palindrome");
        }
    }
}
