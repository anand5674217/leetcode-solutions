class DetermineWhetherMatrixCanBeObtainedByRotationSolution {
    public boolean findRotation(int[][] mat, int[][] tar) {
        int n = mat.length;
        int m = mat[0].length;

        int cnt1 = 0;
        int tar1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    cnt1++;
                }
                if (tar[i][j] == 1) {
                    tar1++;
                }
            }
        }

        if (tar1 != cnt1) {
            return false;
        }

        boolean noMatch = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != tar[i][j]) {
                    noMatch = true;
                    break;
                }
            }
        }
        if (!noMatch) {
            return true;
        }

        int[][] rotated = new int[n][m];
        for (int turn = 0; turn < 3; turn++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    rotated[i][j] = mat[j][n - i - 1];
                }
            }

            noMatch = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (rotated[i][j] != tar[i][j]) {
                        noMatch = true;
                        break;
                    }
                }
            }

            if (!noMatch) {
                return true;
            }

            mat = rotated;
            rotated = new int[n][m];
        }

        return false;
    }
}
