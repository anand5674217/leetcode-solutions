class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        long[] leftProduct = new long[n];
        long[] rightProduct = new long[n];

        leftProduct[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i];
        }

        rightProduct[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[i] = (int) rightProduct[i + 1];
            } else if (i == n - 1) {
                ans[i] = (int) leftProduct[n - 2];
            } else {
                ans[i] = (int) (leftProduct[i - 1] * rightProduct[i + 1]);
            }
        }

        return ans;
    }
}
