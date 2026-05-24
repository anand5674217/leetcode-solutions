import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] expected1 = {1, 2};
        int[] actual1 = solution.topKFrequent(nums1, k1);
        printResult(1, nums1, k1, expected1, actual1);

        // Example 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] expected2 = {1};
        int[] actual2 = solution.topKFrequent(nums2, k2);
        printResult(2, nums2, k2, expected2, actual2);

        // Example 3
        int[] nums3 = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k3 = 2;
        int[] expected3 = {1, 2};
        int[] actual3 = solution.topKFrequent(nums3, k3);
        printResult(3, nums3, k3, expected3, actual3);
    }

    private static void printResult(int testCase, int[] nums, int k, int[] expected, int[] actual) {
        System.out.println("Test Case " + testCase + ":");
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", k = " + k);
        System.out.println("Expected (any order): " + Arrays.toString(expected));
        System.out.println("Actual:               " + Arrays.toString(actual));
        
        // Check if both arrays have same elements (ignoring order)
        boolean passed = actual.length == expected.length;
        if (passed) {
            Arrays.sort(expected);
            Arrays.sort(actual);
            passed = Arrays.equals(expected, actual);
        }

        if (passed) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }
}
