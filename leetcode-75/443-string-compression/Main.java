import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}, 6, new char[]{'a', '2', 'b', '2', 'c', '3'});
        runTest(solution, new char[]{'a'}, 1, new char[]{'a'});
        runTest(solution, new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, 4, new char[]{'a', 'b', '1', '2'});
    }

    private static void runTest(Solution solution, char[] chars, int expectedLength, char[] expectedChars) {
        System.out.println("Input: chars = " + Arrays.toString(chars));
        int actualLength = solution.compress(chars);
        System.out.println("Actual Length: " + actualLength);
        System.out.println("Expected Length: " + expectedLength);

        boolean charsMatch = true;
        for (int i = 0; i < expectedLength; i++) {
            if (chars[i] != expectedChars[i]) {
                charsMatch = false;
                break;
            }
        }

        System.out.println("Chars Match (up to actual length): " + charsMatch);
        System.out.println((actualLength == expectedLength && charsMatch) ? "PASS" : "FAIL");
        System.out.println();
    }
}
