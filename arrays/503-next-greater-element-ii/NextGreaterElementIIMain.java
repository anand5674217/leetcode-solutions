import java.util.Arrays;

public class NextGreaterElementIIMain {

    public static void main(String[] args) {
        NextGreaterElementIISolution solution = new NextGreaterElementIISolution();

        int[] nums1 = {1, 2, 1};
        int[] nums2 = {1, 2, 3, 4, 3};

        System.out.println(Arrays.toString(solution.nextGreaterElements(nums1)));
        System.out.println(Arrays.toString(solution.nextGreaterElements(nums2)));
    }
}
