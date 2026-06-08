public class FindMissingNumber {

    public static int missingNum(int[] arr) {
        // Since one number is missing, the total number of elements should be length + 1
        int n = arr.length + 1; 

        // Outer Loop: Roll call from 1 to n
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            
            // Inner Loop: Look through the entire array to find 'i'
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true; 
                    break; // Found it! Stop looking through the array for this number
                }
            }

            // If we checked the whole array and 'i' wasn't there, it's our missing number
            if (!found)
                return i;
        }
        return -1; // If no number is missing
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};  
        System.out.println(missingNum(arr)); // Outputs 6
    }
}