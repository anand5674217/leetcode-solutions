public class MaximumProductSubarrayMain {

    public static void main(String[] args) {
        MaximumProductSubarraySolution solution = new MaximumProductSubarraySolution();

        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};

        System.out.println(solution.maxProduct(nums1));
        System.out.println(solution.maxProduct(nums2));

        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {-5, 4, 1, 2, -3};
        System.out.println(solution.kthLargestElement(nums3,2));
        System.out.println(solution.kthLargestElement(nums4,5));
    }
}
