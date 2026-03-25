public class Main {
    public static void main(String[] args) {
        MaximumNonNegativeProductInMatrixSolution solution = new MaximumNonNegativeProductInMatrixSolution();
        int[][] grid = {
            {1, -2, 1},
            {1, -2, 1},
            {3, -4, 1}
        };

        System.out.println(solution.maxProductPath(grid));
    }
}
