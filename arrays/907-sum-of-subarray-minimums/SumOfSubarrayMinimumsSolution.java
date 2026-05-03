import java.util.Stack;

public class SumOfSubarrayMinimumsSolution {
    private static final int MOD = 1_000_000_007;

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] previousSmallerOrEqual = previousSmallerOrEqual(arr);
        int[] nextSmaller = nextSmaller(arr);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            long leftCount = i - previousSmallerOrEqual[i];
            long rightCount = nextSmaller[i] - i;
            long contribution = (leftCount * rightCount) % MOD;
            contribution = (contribution * arr[i]) % MOD;
            sum = (sum + contribution) % MOD;
        }

        return (int) sum;
    }

    private int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            answer[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        return answer;
    }

    private int[] previousSmallerOrEqual(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        return answer;
    }
}
