import java.util.Arrays;

public class NextGreaterElementIMain {

    public static void main(String[] args) {
        NextGreaterElementISolution solution = new NextGreaterElementISolution();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};

        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(solution.nextGreaterElement(nums3, nums4)));
    }
}
