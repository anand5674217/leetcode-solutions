import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> ls = new ArrayList<>();

        for (Map.Entry<Integer, Integer> map : hs.entrySet()) {
            int value = map.getValue();
            if (!ls.contains(value)) {
                ls.add(value);
            } else {
                return false;
            }
        }

        return true;
    }
}
