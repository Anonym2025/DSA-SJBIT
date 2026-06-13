package day4.twopointer;

public class TrappingRainWater {

    // Trapping Rain Water problem using two pointers
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update left max
                } else {
                    trappedWater += leftMax - height[left]; // Calculate trapped water
                }
                left++; // Move left pointer
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update right max
                } else {
                    trappedWater += rightMax - height[right]; // Calculate trapped water
                }
                right--; // Move right pointer
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trap(height);
        System.out.println("Total trapped rain water: " + result); // Output: Total trapped rain water: 6
    }
    
}
