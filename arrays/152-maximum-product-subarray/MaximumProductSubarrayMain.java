public class MaximumProductSubarrayMain {

    public static void main(String[] args) {
        MaximumProductSubarraySolution solution = new MaximumProductSubarraySolution();

        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};

        System.out.println(solution.maxProduct(nums1));
        System.out.println(solution.maxProduct(nums2));
    }
}
