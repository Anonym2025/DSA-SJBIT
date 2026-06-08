package prefixsufixsum;

public class PrefixSum {

        // Function to compute prefix sum array
        public int[] computePrefixSum(int[] nums) {
            // Create prefix array of same size
            int[] prefix = new int[nums.length];
    
            // Set first element
            prefix[0] = nums[0];
    
            // Compute prefix sums
            for (int i = 1; i < nums.length; i++) {
                prefix[i] = prefix[i - 1] + nums[i];
            }
    
            // Return the prefix sum array
            return prefix;
        }
    
        public static void main(String[] args) {
            // Input array
            int[] nums = {1, 2, 3, 4, 5};
    
            // Create PrefixSum object
            PrefixSum sol = new PrefixSum();
    
            // Call function
            int[] result = sol.computePrefixSum(nums);
    
            // Print result
            for (int val : result)
                System.out.print(val + " ");
        }
    
}
