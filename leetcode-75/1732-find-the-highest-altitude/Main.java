import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{-5, 1, 5, 0, -7}, 1);
        runTest(solution, new int[]{-4, -3, -2, -1, 4, 3, 2}, 0);
        runTest(solution, new int[]{1, 2, -1, -2}, 3);
    }

    private static void runTest(Solution solution, int[] gain, int expected) {
        int actual = solution.largestAltitude(gain);

        System.out.println("gain = " + Arrays.toString(gain));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}

