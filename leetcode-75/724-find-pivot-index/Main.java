import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 7, 3, 6, 5, 6}, 3);
        runTest(solution, new int[]{1, 2, 3}, -1);
        runTest(solution, new int[]{2, 1, -1}, 0);
        runTest(solution, new int[]{0}, 0);
    }

    private static void runTest(Solution solution, int[] nums, int expected) {
        int actual = solution.pivotIndex(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}

