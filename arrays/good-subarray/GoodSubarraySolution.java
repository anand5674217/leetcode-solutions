
import java.util.HashMap;

public class GoodSubarraySolution {

    public int solve(int A, int[] B) {
        int n = B.length;
        int min = 100000;
        if (n == 1 && A == 1) {
            return 1;
        }

        // HashSet<Integer> hs= new HashSet<>();

        HashMap<Integer, Integer> hs = new HashMap<>();
        int i = 0, j = 0;
        while (i < n && j < n && i <= j) {
            if (hs.size() >= A) {
                min = Math.min(min, j - i);
                //(B[i]);
                int val = hs.get(B[i]);

                if (val > 1) {
                    hs.put(B[i], val - 1);
                } else {
                    hs.remove(B[i]);
                }
                i++;
            } else {
                hs.put(B[j], hs.getOrDefault(B[j], 0) + 1);
                if (hs.size() >= A) {
                    min = Math.min(min, j - i + 1);
                    //(B[i]);
                    int val = hs.get(B[i]);

                    if (val > 1) {
                        hs.put(B[i], val - 1);
                    } else {
                        hs.remove(B[i]);
                    }
                    i++;
                }
                j++;
                //}
            }


        }
        return min == 100000 ? -1 : min;
    }


}
