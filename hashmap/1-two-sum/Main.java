import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        runTest(solution, new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});
        runTest(solution, new int[]{3, 2, 4}, 6, new int[]{1, 2});
        runTest(solution, new int[]{3, 3}, 6, new int[]{0, 1});
    }
    private static void runTest(Solution solution, int[] nums, int target, int[] expected) {
        int[] actual = solution.twoSum(nums, target);
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        if (actual.length == 2) Arrays.sort(actual);
        Arrays.sort(expected);
        if (Arrays.equals(actual, expected)) System.out.println("Result: PASS");
        else System.out.println("Result: FAIL");
    }
}
