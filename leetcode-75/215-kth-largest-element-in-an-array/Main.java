public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{3, 2, 1, 5, 6, 4}, 2, 5);
        runTest(solution, new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4);
        runTest(solution, new int[]{1}, 1, 1);
        runTest(solution, new int[]{-1, -1}, 2, -1);
        runTest(solution, new int[]{7, 6, 5, 4, 3, 2, 1}, 5, 3);
    }

    private static void runTest(Solution solution, int[] nums, int k, int expected) {
        int actual = solution.findKthLargest(nums, k);
        System.out.print("Input: nums = [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i == nums.length - 1 ? "" : ","));
        }
        System.out.println("], k = " + k);
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
