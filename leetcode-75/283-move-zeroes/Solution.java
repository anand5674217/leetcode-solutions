class Solution {
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[writeIndex] = num;
                writeIndex++;
            }
        }

        while (writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }
}

