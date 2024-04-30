public class StringManipulator {

    public static String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string
        StringBuilder result = new StringBuilder(input);
        result.reverse();

        return result.toString();
    }

    public static boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)
        if (reverseString(input).equals(input)){
            return true;
        }

        return false;
    }

}
