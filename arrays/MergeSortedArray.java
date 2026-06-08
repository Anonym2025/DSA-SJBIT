public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // Pointer for end of nums1 data
        int j = n - 1;         // Pointer for end of nums2 data
        int k = m + n - 1;     // Pointer for tracking write location at the back of nums1

        // Loop while there are elements remaining in both arrays
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements left over, copy them into the front of nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        // Note: If nums1 has elements left over, they are already in their correct sorted places!
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3; // Number of valid elements in nums1
        int n = 3; // Number of valid elements in nums2

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}