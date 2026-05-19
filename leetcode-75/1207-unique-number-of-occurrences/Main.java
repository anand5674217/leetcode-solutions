import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 2, 2, 1, 1, 3}, true);
        runTest(solution, new int[]{1, 2}, false);
        runTest(solution, new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}, true);
    }

    private static void runTest(Solution solution, int[] arr, boolean expected) {
        boolean actual = solution.uniqueOccurrences(arr);
        System.out.println("Input: arr = " + Arrays.toString(arr));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println(actual == expected ? "PASS" : "FAIL");
        System.out.println();
    }
}
