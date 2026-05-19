import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Optimization1 optimization1 = new Optimization1();

        runTest(solution, optimization1, new int[]{1, 7, 3, 6, 5, 6}, 3);
        runTest(solution, optimization1, new int[]{1, 2, 3}, -1);
        runTest(solution, optimization1, new int[]{2, 1, -1}, 0);
        runTest(solution, optimization1, new int[]{0}, 0);
    }

    private static void runTest(Solution solution, Optimization1 optimization1, int[] nums, int expected) {
        int actual = solution.pivotIndex(nums);
        int optimization1Actual = optimization1.pivotIndex(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("Expected: " + expected);
        System.out.println("Solution:      " + actual);
        System.out.println("Optimization1: " + optimization1Actual);
        System.out.println();
    }
}
