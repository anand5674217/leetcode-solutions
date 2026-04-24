import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsSolution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
        }

        int[] answer = new int[k];
        int index = 0;
        while (k-- > 0) {
            answer[index++] = maxHeap.poll().value;
        }
        return answer;
    }
}

class Pair {
    int value;
    int freq;

    Pair(int value, int freq) {
        this.value = value;
        this.freq = freq;
    }
}
