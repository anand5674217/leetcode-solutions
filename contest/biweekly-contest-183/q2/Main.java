import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 4, 2, 8}, 3, 2);
        runTest(solution, new int[]{1, 1, 1}, 3, 1);
    }

    private static void runTest(Solution solution, int[] nums, int k, int expected) {
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", k = " + k);
        int actual = solution.minOperations(nums, k);
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
