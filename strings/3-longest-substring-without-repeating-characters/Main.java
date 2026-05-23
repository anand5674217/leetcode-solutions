public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, "abcabcbb", 3);
        runTest(solution, "bbbbb", 1);
        runTest(solution, "pwwkew", 3);
        runTest(solution, "", 0);
        runTest(solution, " ", 1);
        runTest(solution, "au", 2);
        runTest(solution, "dvdf", 3);
    }

    private static void runTest(Solution solution, String s, int expected) {
        int actual = solution.lengthOfLongestSubstring(s);
        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        if (actual == expected) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }
}
