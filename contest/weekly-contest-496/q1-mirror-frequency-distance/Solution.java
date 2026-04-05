import java.util.HashMap;
import java.util.Map;

class WeeklyContest496Q1Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character, Integer> charFreqMap = new HashMap<>();
        HashMap<Integer, Integer> intFreqMap = new HashMap<>();
        int charFreq[] = new int[26];
        int intFreq[] = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
                charFreq[c - 'a']++;
            } else {
                int key = (int) (c - '0');
                intFreqMap.put(key, intFreqMap.getOrDefault(key, 0) + 1);
                intFreq[key]++;
            }
        }
        HashMap<Character, Character> characterHashMap = new HashMap<>();
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        for (int i = 0; i <= 9; i++) {
            integerHashMap.put(i, 9 - i);
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            char m = (char) ('z' - i);
            characterHashMap.put(c, m);
        }

        int sum = 0;
        for (Map.Entry entry : charFreqMap.entrySet()) {
            char ch = (char) entry.getKey();
            if (charFreq[ch - 'a'] > 0) {
                int val = (int) entry.getValue();

                char counterCh = characterHashMap.get(ch);
                int counterVal = charFreqMap.getOrDefault(counterCh, 0);
                sum += Math.abs(val - counterVal);
                charFreq[counterCh - 'a'] = 0;
                charFreq[ch - 'a'] = 0;
            }
        }

        for (Map.Entry entry : intFreqMap.entrySet()) {
            int key = (int) entry.getKey();
            if (intFreq[key] > 0) {
                int val = (int) entry.getValue();
                int counterKey = integerHashMap.get(key);
                int counterVal = intFreqMap.getOrDefault(counterKey, 0);
                sum += Math.abs(val - counterVal);
                intFreq[key] = 0;
                intFreq[counterKey] = 0;
            }
        }
        return sum;
    }
}
