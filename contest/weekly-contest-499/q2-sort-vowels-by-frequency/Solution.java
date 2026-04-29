import java.util.Arrays;

class Solution {
    public String sortVowels(String s) {
        char[] chars = s.toCharArray();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        int[] first = new int[5];

        Arrays.fill(first, -1);

        for (int i = 0; i < chars.length; i++) {
            int idx = vowelIndex(chars[i]);
            if (idx != -1) {
                freq[idx]++;
                if (first[idx] == -1) {
                    first[idx] = i;
                }
            }
        }

        Integer[] order = {0, 1, 2, 3, 4};

        Arrays.sort(order, (x, y) -> {
            if (freq[x] != freq[y]) {
                return freq[y] - freq[x];
            }
            return first[x] - first[y];
        });

        int pos = 0;

        for (int idx : order) {
            while (freq[idx] > 0) {
                while (pos < chars.length && vowelIndex(chars[pos]) == -1) {
                    pos++;
                }

                chars[pos] = vowels[idx];
                pos++;
                freq[idx]--;
            }
        }

        return new String(chars);
    }

    private int vowelIndex(char c) {
        if (c == 'a') {
            return 0;
        }
        if (c == 'e') {
            return 1;
        }
        if (c == 'i') {
            return 2;
        }
        if (c == 'o') {
            return 3;
        }
        if (c == 'u') {
            return 4;
        }
        return -1;
    }
}
