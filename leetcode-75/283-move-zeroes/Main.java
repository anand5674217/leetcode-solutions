import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0});
        runTest(solution, new int[]{0}, new int[]{0});
        runTest(solution, new int[]{1, 2, 3}, new int[]{1, 2, 3});
        runTest(solution, new int[]{0, 0, 1}, new int[]{1, 0, 0});
    }

    private static void runTest(Solution solution, int[] nums, int[] expected) {
        int[] actual = Arrays.copyOf(nums, nums.length);
        solution.moveZeroes(actual);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual:   " + Arrays.toString(actual));
        System.out.println();
    }
}

