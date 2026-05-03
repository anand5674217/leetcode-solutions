public class SumOfSubarrayMinimumsMain {

    public static void main(String[] args) {
        SumOfSubarrayMinimumsSolution solution = new SumOfSubarrayMinimumsSolution();

        int[] arr1 = {3, 1, 2, 4};
        int[] arr2 = {11, 81, 94, 43, 3};

        System.out.println(solution.sumSubarrayMins(arr1));
        System.out.println(solution.sumSubarrayMins(arr2));
    }
}
