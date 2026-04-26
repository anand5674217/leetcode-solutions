import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        String glanvoture = s;

        int[] frequency = new int[5];
        int[] firstPosition = new int[5];
        for (int i = 0; i < 5; i++) {
            firstPosition[i] = -1;
        }

        char[] chars = glanvoture.toCharArray();
        List<Integer> vowelPositions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int vowelIndex = getVowelIndex(chars[i]);
            if (vowelIndex != -1) {
                vowelPositions.add(i);
                frequency[vowelIndex]++;
                if (firstPosition[vowelIndex] == -1) {
                    firstPosition[vowelIndex] = i;
                }
            }
        }

        List<Integer> presentVowels = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (frequency[i] > 0) {
                presentVowels.add(i);
            }
        }

        Collections.sort(presentVowels, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (frequency[a] != frequency[b]) {
                    return Integer.compare(frequency[b], frequency[a]);
                }
                return Integer.compare(firstPosition[a], firstPosition[b]);
            }
        });

        List<Character> orderedVowels = new ArrayList<>();
        for (int vowelIndex : presentVowels) {
            for (int count = 0; count < frequency[vowelIndex]; count++) {
                orderedVowels.add(getVowelChar(vowelIndex));
            }
        }

        for (int i = 0; i < vowelPositions.size(); i++) {
            chars[vowelPositions.get(i)] = orderedVowels.get(i);
        }

        return new String(chars);
    }

    private int getVowelIndex(char ch) {
        if (ch == 'a') {
            return 0;
        }
        if (ch == 'e') {
            return 1;
        }
        if (ch == 'i') {
            return 2;
        }
        if (ch == 'o') {
            return 3;
        }
        if (ch == 'u') {
            return 4;
        }
        return -1;
    }

    private char getVowelChar(int index) {
        if (index == 0) {
            return 'a';
        }
        if (index == 1) {
            return 'e';
        }
        if (index == 2) {
            return 'i';
        }
        if (index == 3) {
            return 'o';
        }
        return 'u';
    }
}
