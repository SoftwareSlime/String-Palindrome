package Other;

import java.util.Scanner;

public class StrPalindrome {
    public static boolean isPalindrome(String str) {
        // Remove whitespace and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) { // Iterate until the pointers meet
            // Compare characters at the left and right positions
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int Int) {
        int x = Int;
        int reverse = 0;
        //store final number
        while (x > 0) {
            int remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x / 10;
        }
        if (x == reverse) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = scan.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println("'" + userInput + "' is a palindrome.");
        } else {
            System.out.println("'" + userInput + "' is not a palindrome.");
        }
    }
}