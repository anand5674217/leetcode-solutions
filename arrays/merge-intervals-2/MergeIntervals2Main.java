import java.util.Arrays;

public class MergeIntervals2Main {
    public static void main(String[] args) {
        MergeIntervals2Solution solution = new MergeIntervals2Solution();

        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};

        int[][] intervals2 = {{1, 3}, {6, 9}};
        int[] newInterval2 = {2, 6};

        System.out.println(Arrays.deepToString(solution.insert(intervals1, newInterval1)));
        System.out.println(Arrays.deepToString(solution.insert(intervals2, newInterval2)));
    }
}
