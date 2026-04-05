import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WeeklyContest496Q2Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = (int) Math.pow(n, 1.0 / 3.0) + 1;
        for (int i = 1; i <= maxValue; i++) {
            for (int j = i; j <= maxValue; j++) {
                int val = (int) Math.pow(i, 3) + (int) Math.pow(j, 3);
                if (val <= n) {
                    int count = map.getOrDefault(val, 0);
                    map.put(val, count + 1);
                } else {
                    break;
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value >= 2) {
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}
