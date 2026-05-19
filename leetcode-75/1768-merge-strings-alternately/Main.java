public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, "abc", "pqr", "apbqcr");
        runTest(solution, "ab", "pqrs", "apbqrs");
        runTest(solution, "abcd", "pq", "apbqcd");
    }

    private static void runTest(Solution solution, String word1, String word2, String expected) {
        String actual = solution.mergeAlternately(word1, word2);
        System.out.println("word1 = " + word1 + ", word2 = " + word2);
        System.out.println("Expected: \"" + expected + "\"");
        System.out.println("Actual:   \"" + actual + "\"");
        System.out.println();
    }
}

