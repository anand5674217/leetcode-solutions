public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, "ABCABC", "ABC", "ABC");
        runTest(solution, "ABABAB", "ABAB", "AB");
        runTest(solution, "LEET", "CODE", "");
        runTest(solution, "AAAAAB", "AAA", "");
    }

    private static void runTest(Solution solution, String str1, String str2, String expected) {
        String actual = solution.gcdOfStrings(str1, str2);
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        System.out.println("Expected: \"" + expected + "\"");
        System.out.println("Actual:   \"" + actual + "\"");
        System.out.println();
    }
}
