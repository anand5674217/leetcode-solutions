public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, "the sky is blue", "blue is sky the");
        runTest(solution, "  hello world  ", "world hello");
        runTest(solution, "a good   example", "example good a");
        runTest(solution, "a good    example", "example good a");
    }

    private static void runTest(Solution solution, String s, String expected) {
        String actual = solution.reverseWords(s);

        System.out.println("s = \"" + s + "\"");
        System.out.println("Expected: \"" + expected + "\"");
        System.out.println("Actual:   \"" + actual + "\"");
        System.out.println();
    }
}

