import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[]{1, 0, 0, 0, 1}, 1, true);
        runTest(solution, new int[]{1, 0, 0, 0, 1}, 2, false);
        runTest(solution, new int[]{0}, 1, true);
        runTest(solution, new int[]{0, 0, 1, 0, 0}, 2, true);
    }

    private static void runTest(Solution solution, int[] flowerbed, int n, boolean expected) {
        int[] input = Arrays.copyOf(flowerbed, flowerbed.length);
        boolean actual = solution.canPlaceFlowers(input, n);

        System.out.println("flowerbed = " + Arrays.toString(flowerbed) + ", n = " + n);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}

