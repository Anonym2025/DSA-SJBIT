public class SecondLargestElement {

    public static int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            // Case 1: Found a new absolute maximum
            if (num > largest) {
                secondLargest = largest; // Old champion drops to second place
                largest = num;           // Update to new champion
            } 
            // Case 2: Found a number between largest and secondLargest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;     // Update the runner-up position
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(getSecondLargest(arr)); // Output: 4
    }
}