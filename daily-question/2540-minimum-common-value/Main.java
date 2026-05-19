import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 2, 3}, new int[]{2, 4}, 2);
        runTest(solution, new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}, 2);
        runTest(solution, new int[]{1, 5, 9}, new int[]{2, 4, 6}, -1);
    }

    private static void runTest(Solution solution, int[] nums1, int[] nums2, int expected) {
        int actual = solution.getCommon(nums1, nums2);

        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("nums2 = " + Arrays.toString(nums2));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}

