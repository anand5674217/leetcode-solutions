import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{2, 3, 5, 1, 3}, 3, List.of(true, true, true, false, true));
        runTest(solution, new int[]{4, 2, 1, 1, 2}, 1, List.of(true, false, false, false, false));
        runTest(solution, new int[]{12, 1, 12}, 10, List.of(true, false, true));
    }

    private static void runTest(Solution solution, int[] candies, int extraCandies, List<Boolean> expected) {
        List<Boolean> actual = solution.kidsWithCandies(candies, extraCandies);
        System.out.println("candies = " + Arrays.toString(candies) + ", extraCandies = " + extraCandies);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}

