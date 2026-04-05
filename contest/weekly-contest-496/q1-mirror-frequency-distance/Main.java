public class Main {
    public static void main(String[] args) {
        WeeklyContest496Q1Solution solution = new WeeklyContest496Q1Solution();

        String s1 = "ab1z9";
        String s2 = "4m7n";
        String s3 = "byby";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.mirrorFrequency(s1));

        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.mirrorFrequency(s2));

        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.mirrorFrequency(s3));
    }
}
