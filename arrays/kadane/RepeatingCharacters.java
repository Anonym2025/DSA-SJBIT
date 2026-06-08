package kadane;

public class RepeatingCharacters {
    public static int maxPower(String s) {
        // Edge case: An empty string has a max streak of 0
        if (s == null || s.length() == 0) return 0;

        // Step 1: Assume the first character sets a baseline streak of 1
        int currentStreak = 1;
        int maxStreak = 1;

        // Step 2: Loop through the rest of the string starting at index 1
        for (int i = 1; i < s.length(); i++) {
            
            // Check if the current character continues the previous character's streak
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentStreak++; // Extend the streak
            } else {
                currentStreak = 1; // Streak broken! Reset back to 1 for the new character
            }

            // Update the all-time high score record
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        String test = "abbcccdddd";
        System.out.println("Longest repeating substring length: " + maxPower(test)); // Outputs 4
    }
}
