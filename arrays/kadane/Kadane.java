package kadane;

public class Kadane {

    public static int maxSubArray(int[] nums) {
        // Step 1: Assume the first element is the champion baseline
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Step 2: Loop through the rest of the array starting at index 1
        for (int i = 1; i < nums.length; i++) {
            
            // Decision: Is it better to add the current element to our streak, 
            // or start a completely new streak from this element?
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // If our current streak is better than the all-time record, update the record
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

        public static void main(String[] args) {
            int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    
            System.out.println(maxSubArray(arr));
        }
    
}
