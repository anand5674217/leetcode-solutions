import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2, 6);
        runTest(solution, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3, 10);
    }

    private static void runTest(Solution solution, int[] nums, int k, int expected) {
        int actual = solution.longestOnes(nums, k);
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", k = " + k);
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
