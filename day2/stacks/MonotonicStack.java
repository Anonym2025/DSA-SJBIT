package day2.stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MonotonicStack {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        // We use a Monotonically Decreasing Stack to store *indices*
        Deque<Integer> stack = new ArrayDeque<>(); 

        for (int i = 0; i < nums.length; i++) {
            // While the current element is larger than the element at the top of our stack,
            // it means we found the "next greater element" for that stack element.
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int prevIdx = stack.pop();
                result[prevIdx] = nums[i];
            }
            stack.push(i); // Push the current index
        }

        // Any indices left in the stack have no greater element to their right
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreaterElement(nums))); 
        // Output: [5, 25, 25, -1]
    }
}