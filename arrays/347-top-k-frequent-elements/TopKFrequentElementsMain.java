import java.util.Arrays;

public class TopKFrequentElementsMain {

    public static void main(String[] args) {
        TopKFrequentElementsSolution solution = new TopKFrequentElementsSolution();

        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int[] nums2 = {1};

        System.out.println(Arrays.toString(solution.topKFrequent(nums1, 2)));
        System.out.println(Arrays.toString(solution.topKFrequent(nums2, 1)));
    }
}
