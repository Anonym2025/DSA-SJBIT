package basics;

public class MinandMaxArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        //what if we pass an empty array, we will get an error because we are trying to access the first element of the array which is not present
        //to avoid this we can check if the array is empty or not
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        int n = arr.length;

        //why we need to start from 1 because we have already assigned the first element to min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);
    } 
}
