package day4.twopointer;

public class MoveZeroestoEnd {
    
    // Move Zeroes to End using two pointers
    public static void moveZeroes(int[] nums) {
        int left = 0; // Pointer for the position of the next non-zero element

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap the non-zero element to the left pointer position
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++; // Move the left pointer to the next position
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.print("Array after moving zeroes to the end: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: Array after moving zeroes to the end: 1 3 12 0 0 
    }
}
