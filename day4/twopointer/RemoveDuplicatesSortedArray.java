package day4.twopointer;
public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int slow = 0; // Tracks the position of unique elements

        // Fast pointer 'fast' scans the array
        for (int fast = 1; fast < nums.length; fast++) {
            // If we find a new unique value
            if (nums[fast] != nums[slow]) {
                slow++; // Move unique marker forward
                nums[slow] = nums[fast]; // Overwrite with the new value
            }
        }
        // Length of unique array is index + 1
        return slow + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3, 4, 4, 5 };

        int newLength = removeDuplicates(nums);

        // Print the unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}