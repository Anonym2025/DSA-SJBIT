public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        // Pointer to track the position where the next non-zero element belongs
        int write = 0;

        // Read pointer iterates through the entire array
        for (int read = 0; read < nums.length; read++) {
            // When we find a non-zero element...
            if (nums[read] != 0) {
                // Swap the elements at 'read' and 'write' positions
                int temp = nums[read];
                nums[read] = nums[write];
                nums[write] = temp;

                // Move the write pointer forward
                write++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        
        // Print modified array: [1, 3, 12, 0, 0]
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}