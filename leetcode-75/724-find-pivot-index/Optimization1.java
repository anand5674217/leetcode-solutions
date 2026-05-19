class Optimization1 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftPrefix = new int[n];

        if (n == 1) {
            return 0;
        }

        leftPrefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftPrefix[i] = leftPrefix[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0 && leftPrefix[n - 1] - leftPrefix[i] == 0) {
                return i;
            }

            if (i == n - 1 && leftPrefix[i - 1] == 0) {
                return i;
            }

            if (i != 0 && i != n - 1 && leftPrefix[i - 1] == leftPrefix[n - 1] - leftPrefix[i]) {
                return i;
            }
        }

        return -1;
    }
}

