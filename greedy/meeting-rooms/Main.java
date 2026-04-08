public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] meetings1 = {
                {0, 30},
                {5, 10},
                {15, 20}
        };

        int[][] meetings2 = {
                {1, 18},
                {18, 23},
                {15, 29},
                {4, 15},
                {2, 11},
                {5, 13}
        };

        int[][] meetings3 = {
                {1, 14},
                {0, 8},
                {16, 21},
                {21, 22}
        };

      //  System.out.println(solution.solve(meetings1));
        System.out.println(solution.solve(meetings2));
        System.out.println(solution.solve(meetings3));
    }
}
