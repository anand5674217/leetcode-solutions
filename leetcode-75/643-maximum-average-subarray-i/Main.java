import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75);
        runTest(solution, new int[]{5}, 1, 5.0);
        runTest(solution, new int[]{0, 4, 0, 3, 2}, 1, 4.0);
    }

    private static void runTest(Solution solution, int[] nums, int k, double expected) {
        double actual = solution.findMaxAverage(nums, k);

        System.out.println("nums = " + Arrays.toString(nums) + ", k = " + k);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}

