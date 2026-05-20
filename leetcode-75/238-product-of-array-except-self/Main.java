import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6});
        runTest(solution, new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0});
    }

    private static void runTest(Solution solution, int[] nums, int[] expected) {
        int[] actual = solution.productExceptSelf(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual:   " + Arrays.toString(actual));
        System.out.println();
    }
}
