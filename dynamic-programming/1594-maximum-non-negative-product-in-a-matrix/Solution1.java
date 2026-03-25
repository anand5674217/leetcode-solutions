class MaximumNonNegativeProductInMatrixSolution {
    private long max = -1;

    public int maxProductPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        handle(0, 0, n, m, grid, 1);

        if (max < 0) {
            return -1;
        }
        return (int) (max % 1000000007);
    }

    private void handle(int i, int j, int n, int m, int[][] grid, long prod) {
        if (i == n - 1 && j == m - 1) {
            long current = prod * grid[i][j];
            if (current > max) {
                max = current;
            }
            return;
        }

        if ((j + 1) < m) {
            handle(i, j + 1, n, m, grid, prod * grid[i][j]);
        }

        if ((i + 1) < n) {
            handle(i + 1, j, n, m, grid, prod * grid[i][j]);
        }
    }
}
