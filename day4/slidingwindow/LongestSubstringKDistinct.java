package day4.slidingwindow;

public class LongestSubstringKDistinct {
    public static int findLongestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;

        int maxLength = 0;
        int start = 0;
        int distinctCount = 0;
        int[] charFreq = new int[128]; // ASCII frequency counter

        for (int end = 0; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            if (charFreq[rightChar] == 0) {
                distinctCount++; // New distinct character entered the window
            }
            charFreq[rightChar]++;

            // If we violate the rule (distinct elements > k), shrink from the left
            while (distinctCount > k) {
                char leftChar = s.charAt(start);
                charFreq[leftChar]--;
                if (charFreq[leftChar] == 0) {
                    distinctCount--; // A character completely exited our window
                }
                start++; // Shrink window boundary
            }

            // Record the maximum size achieved under valid conditions
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;

        System.out.println(findLongestSubstring(s, k)); // Output: 3 ("ece")
    }
}