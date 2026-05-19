class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (reversed.length() > 0) {
                reversed.append(' ');
            }

            reversed.append(words[i]);
        }

        return reversed.toString();
    }
}

