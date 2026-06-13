package day4.slidingwindow;

import java.util.HashSet;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the window size exceeds k, remove the oldest element from the left
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }

            // If we can't add the number, it means it already exists in the current window!
            if (!window.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums, k)); // Output: true
    }
    
}
