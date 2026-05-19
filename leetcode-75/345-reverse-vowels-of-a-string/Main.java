public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, "IceCreAm", "AceCreIm");
        runTest(solution, "leetcode", "leotcede");
        runTest(solution, "aA", "Aa");
        runTest(solution, "bcdfg", "bcdfg");
    }

    private static void runTest(Solution solution, String s, String expected) {
        String actual = solution.reverseVowels(s);

        System.out.println("s = \"" + s + "\"");
        System.out.println("Expected: \"" + expected + "\"");
        System.out.println("Actual:   \"" + actual + "\"");
        System.out.println();
    }
}

