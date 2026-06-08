package prefixsufixsum;

public class SuffixSum {
    // Function to compute suffix sum array
    public int[] computeSuffixSum(int[] nums) {
        // Create suffix array of same size
        int[] suffix = new int[nums.length];

        // Set last element
        suffix[nums.length - 1] = nums[nums.length - 1];

        // Compute suffix sums
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        // Return the suffix sum array
        return suffix;
    }

    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 2, 3, 4, 5};

        // Create SuffixSum object
        SuffixSum sol = new SuffixSum();

        // Call function
        int[] result = sol.computeSuffixSum(nums);

        // Print result
        for (int val : result)
            System.out.print(val + " ");
    }
    
}
