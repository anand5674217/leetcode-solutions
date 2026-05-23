import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{0, 1, 0, 3, 12}, 2);
        runTest(solution, new int[]{0, 1, 0, 2}, 1);
        runTest(solution, new int[]{1, 2, 0}, 0);
        runTest(solution, new int[]{0, 0, 0}, 0);
        runTest(solution, new int[]{1, 2, 3}, 0);
        runTest(solution, new int[]{0, 1}, 1);
        runTest(solution, new int[]{1, 0}, 0);
    }

    private static void runTest(Solution solution, int[] nums, int expected) {
        int actual = solution.minimumSwaps(nums);
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        if (actual == expected) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }
}
