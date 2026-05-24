import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals1Copy = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected1 = {{1, 6}, {8, 10}, {15, 18}};
        int[][] actual1 = solution.merge(intervals1);
        printResult(1, intervals1Copy, expected1, actual1);

        // Example 2
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] intervals2Copy = {{1, 4}, {4, 5}};
        int[][] expected2 = {{1, 5}};
        int[][] actual2 = solution.merge(intervals2);
        printResult(2, intervals2Copy, expected2, actual2);

        // Example 3
        int[][] intervals3 = {{4, 7}, {1, 4}};
        int[][] intervals3Copy = {{4, 7}, {1, 4}};
        int[][] expected3 = {{1, 7}};
        int[][] actual3 = solution.merge(intervals3);
        printResult(3, intervals3Copy, expected3, actual3);
    }

    private static void printResult(int testCase, int[][] input, int[][] expected, int[][] actual) {
        System.out.println("Test Case " + testCase + ":");
        System.out.println("Input:    " + Arrays.deepToString(input));
        System.out.println("Expected: " + Arrays.deepToString(expected));
        System.out.println("Actual:   " + Arrays.deepToString(actual));
        
        boolean passed = Arrays.deepEquals(expected, actual);
        if (passed) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }
}
