public class GoodSubarrayMain {
    public static void main(String[] args) {
        GoodSubarraySolution solution = new GoodSubarraySolution();

        int[] arr1 = {1, 2, 1, 3, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {5, 5, 5};

        System.out.println(solution.solve(3, arr1));
        System.out.println(solution.solve(2, arr2));
        System.out.println(solution.solve(2, arr3));
    }
}
