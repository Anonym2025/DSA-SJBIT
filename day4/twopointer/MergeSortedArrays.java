package day4.twopointer;

public class MergeSortedArrays {
    public static int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        
        int p1 = 0; // Pointer for nums1
        int p2 = 0; // Pointer for nums2
        int r = 0;  // Pointer for result array

        // Move through both arrays until one runs out
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] <= nums2[p2]) {
                result[r] = nums1[p1];
                p1++;
            } else {
                result[r] = nums2[p2];
                p2++;
            }
            r++;
        }

        // If elements are left over in nums1, copy them
        while (p1 < nums1.length) {
            result[r++] = nums1[p1++];
        }

        // If elements are left over in nums2, copy them
        while (p2 < nums2.length) {
            result[r++] = nums2[p2++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] merged = merge(nums1, nums2);

        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        // Output: Merged array: 1 2 3 4 5 6 
    }
}
