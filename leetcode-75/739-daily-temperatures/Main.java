import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result1 = solution.dailyTemperatures(temperatures1);
        System.out.println("Example 1: " + Arrays.toString(result1));
        // Expected: [1, 1, 4, 2, 1, 1, 0, 0]

        // Example 2
        int[] temperatures2 = {30, 40, 50, 60};
        int[] result2 = solution.dailyTemperatures(temperatures2);
        System.out.println("Example 2: " + Arrays.toString(result2));
        // Expected: [1, 1, 1, 0]

        // Example 3
        int[] temperatures3 = {30, 60, 90};
        int[] result3 = solution.dailyTemperatures(temperatures3);
        System.out.println("Example 3: " + Arrays.toString(result3));
        // Expected: [1, 1, 0]
    }
}
