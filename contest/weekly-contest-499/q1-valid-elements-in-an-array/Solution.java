import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            List<Integer> answer = new ArrayList<>();
            answer.add(nums[0]);
            return answer;
        }

        int[] maxFromLeft = new int[n];
        int[] maxFromRight = new int[n];
        maxFromLeft[0] = nums[0];
        maxFromRight[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            maxFromLeft[i] = Math.max(maxFromLeft[i - 1], nums[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            maxFromRight[i] = Math.max(maxFromRight[i + 1], nums[i]);
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > maxFromLeft[i - 1] || nums[i] > maxFromRight[i + 1]) {
                answer.add(nums[i]);
            }
        }

        answer.add(nums[n - 1]);
        return answer;
    }
}
