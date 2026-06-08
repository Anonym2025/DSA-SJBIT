package prefixsufixsum;

public class EquilibriumIndex {
    
    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Step 1: Find the total sum of the entire array
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: Traverse and check each index dynamically
        for (int i = 0; i < arr.length; i++) {
            // Right sum is total sum minus what's on the left and the current element
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i; // Found the equilibrium index!
            }

            // Update left sum for the next index iteration
            leftSum += arr[i];
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("Equilibrium Index: " + findEquilibrium(arr)); // Outputs 3
    }
}
