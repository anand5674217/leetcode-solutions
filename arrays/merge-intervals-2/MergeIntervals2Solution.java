import java.util.ArrayList;
import java.util.List;

public class MergeIntervals2Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }

        List<int[]> merged = new ArrayList<>();
        int index = 0;
        int n = intervals.length;
        int start = newInterval[0];
        int end = newInterval[1];

        while (index < n && intervals[index][1] < start) {
            merged.add(intervals[index]);
            index++;
        }

        while (index < n && intervals[index][0] <= end) {
            start = Math.min(start, intervals[index][0]);
            end = Math.max(end, intervals[index][1]);
            index++;
        }

        merged.add(new int[]{start, end});

        while (index < n) {
            merged.add(intervals[index]);
            index++;
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
