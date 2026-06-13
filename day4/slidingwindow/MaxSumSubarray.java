package day4.slidingwindow;

public class MaxSumSubarray {
    public static int findMaxSum(int[] arr, int k) {
        if (arr == null || arr.length < k) return 0;

        int windowSum = 0;
        int maxSum = 0;

        // Step 1: Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Step 2: Slide the window across the rest of the array
        for (int i = k; i < arr.length; i++) {
            // Add the incoming element, subtract the outgoing element
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println(findMaxSum(arr, k)); // Output: 9 (4 + 5)
    }
}
