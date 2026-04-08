import java.util.Arrays;

public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        int[] d = new int[n];
        Arrays.fill(d, -1);
        int initialVal = nums[0];
        for (int i = 1; i <= initialVal && i < n; i++) {
            boolean val = handle(i, nums, d);
            if (val)
                return true;
        }
        return false;
    }


    public boolean handle(int nextCounter, int[] nums, int[] d) {

        int n = nums.length;

        if (nextCounter >= n - 1) {
            return true;
        }
        if (d[nextCounter] != -1) {
            return d[nextCounter] != 0;
        }

        int initialVal = nums[nextCounter];
        for (int i = 1; i <= initialVal && nextCounter + i < n; i++) {
            boolean val = handle(nextCounter + i, nums, d);
            d[nextCounter + i] = val ? 1 : 0;
            if (val)
                return val;
        }
        d[nextCounter] = 0;
        return false;
    }
}
