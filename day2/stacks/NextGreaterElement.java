package day2.stacks;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        int[] result = nextGreaterElement(nums);
        System.out.print("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
