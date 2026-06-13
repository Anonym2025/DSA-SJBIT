package day4.slidingwindow;

public class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int start = 0;

        // 'end' expands the window
        for (int end = 0; end < nums.length; end++) {
            windowSum += nums[end];

            // Squeeze the window from the left as long as the condition is satisfied
            while (windowSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                windowSum -= nums[start]; // Remove the left element
                start++;                  // Shrink window
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        System.out.println(minSubArrayLen(target, nums)); // Output: 2 (subarray [4,3])
    }
}
