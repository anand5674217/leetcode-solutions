public class Main {
    public static void main(String[] args) {
        RotatedSortedArray solution = new RotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(solution.search(nums, target));
    }
}
