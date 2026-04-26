import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 4, 2, 3, 2};
        int[] nums2 = {5, 5, 5, 5};
        int[] nums3 = {1};

        List<Integer> result1 = solution.findValidElements(nums1);
        List<Integer> result2 = solution.findValidElements(nums2);
        List<Integer> result3 = solution.findValidElements(nums3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
