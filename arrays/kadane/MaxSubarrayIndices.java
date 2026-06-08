package kadane;

public class MaxSubarrayIndices {
    public static void printMaxSubarray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        int start = 0;
        int end = 0;
        int tentativeStart = 0; // Tracks where a new streak begins

        for (int i = 1; i < nums.length; i++) {
            // If the past is a dragging us down (negative), dump it!
            if (currentSum < 0) {
                currentSum = nums[i];
                tentativeStart = i; // This is the start of a potential new champion streak
            } else {
                currentSum += nums[i]; // Extend the current streak
            }

            // Check if we broke the all-time record
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tentativeStart; // Lock in the start of this winning streak
                end = i;               // Lock in the current end position
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
        System.out.println("Subarray Indices: From Index " + start + " to " + end);
    }
}
