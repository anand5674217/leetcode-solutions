import java.util.Arrays;

class WeeklyContest494Q1Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;

        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if ((nums1[i] % 2) == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] nums2 = new int[n];
        if (even > odd) {
            for (int i = 0; i < n; i++) {
                if (nums1[i] % 2 == 0) {
                    nums2[i] = nums1[i];
                } else {
                    for (int j = 0; j < n; j++) {
                        if (i != j && ((nums1[i] - nums1[j]) % 2 == 0)) {
                            nums2[i] = nums1[i] - nums1[j];
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (nums2[i] % 2 != 0) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (nums1[i] % 2 != 0) {
                    nums2[i] = nums1[i];
                } else {
                    for (int j = 0; j < n; j++) {
                        if (i != j && ((nums1[i] - nums1[j]) % 2 != 0)) {
                            nums2[i] = nums1[i] - nums1[j];
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (nums2[i] % 2 == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static String formatInput(int[] nums) {
        return Arrays.toString(nums);
    }
}
