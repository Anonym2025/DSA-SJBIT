package basics;

public class CountFrequency {

    /*
     Step-by-step approach:
     1. Initialize a visited boolean array of the same length as the input array.
     2. Traverse each element in the array using an outer loop.
     3. Skip the element if it has already been processed (visited).
     4. If not visited, count occurrences of the current element in the remaining array.
     5. Mark duplicate elements as visited to avoid recounting.
     6. Print the element and its frequency.
    */

    // Function to count frequency of each element in the array
    public void countFreq(int[] arr, int n) {
        // Create a visited array to mark elements that are already processed
        boolean[] visited = new boolean[n];

        // Traverse through all elements of the array
        for (int i = 0; i < n; i++) {
            // Skip this element if it's already processed
            if (visited[i])
                continue;

            // Count the frequency of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark arr[j] as processed
                    count++;
                }
            }

            // Output the element and its count
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,2,4,5,5};

        ///boolean array method
        CountFrequency cf = new CountFrequency();
        cf.countFreq(arr, arr.length);

    }
    
}
