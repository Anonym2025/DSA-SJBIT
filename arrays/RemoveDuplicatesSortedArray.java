public class RemoveDuplicatesSortedArray {
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        // Pointer to track where to place the next unique element
        int write = 1; 

        // Read pointer scans the array starting from the second element
        for (int read = 1; read < nums.length; read++) {
            // If current element is different from the previous one, it's unique!
            if (nums[read] != nums[read - 1]) {
                nums[write] = nums[read]; // Put it in the unique zone
                write++;                  // Move the unique zone boundary forward
            }
        }

        return write; // 'write' equals the total count of unique elements
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 4, 4, 5};

        int newLength = removeDuplicates(nums);

        // Print the unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}