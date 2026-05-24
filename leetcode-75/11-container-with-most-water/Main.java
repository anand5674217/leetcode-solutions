import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected1 = 49;
        int actual1 = solution.maxArea(height1);
        printResult(1, height1, expected1, actual1);

        // Example 2
        int[] height2 = {1, 1};
        int expected2 = 1;
        int actual2 = solution.maxArea(height2);
        printResult(2, height2, expected2, actual2);
    }

    private static void printResult(int testCase, int[] height, int expected, int actual) {
        System.out.println("Test Case " + testCase + ":");
        System.out.println("Input: height = " + Arrays.toString(height));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        if (expected == actual) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }
}
