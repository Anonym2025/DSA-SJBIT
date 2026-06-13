package day4.twopointer;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap the characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] str = {'H', 'e', 'l', 'l', 'o'};
        reverseString(str);
        System.out.println(str); // Output: "olleH"
    }
}
