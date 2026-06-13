package day4.twopointer;

public class Palindrome {

   public static boolean isPalindrome(String s) {
        // Step 1: Initialize the two pointers
        int left = 0;
        int right = s.length() - 1;

        // Step 2: Loop until the pointers meet in the middle
        while (left < right) {
            // Step 3: Compare characters at both pointers
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Found a mismatch! Not a palindrome.
            }
            
            // Step 4: Move the pointers closer together
            left++;
            right--;
        }

        // If the loop finishes without a mismatch, it's a palindrome!
        return true; 
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
}
