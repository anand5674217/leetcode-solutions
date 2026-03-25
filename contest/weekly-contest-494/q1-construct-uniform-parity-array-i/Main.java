public class Main {
    public static void main(String[] args) {
        WeeklyContest494Q1Solution solution = new WeeklyContest494Q1Solution();
        int[] nums = {1, 2, 3, 4};

        System.out.println("Input: " + WeeklyContest494Q1Solution.formatInput(nums));
        System.out.println("Can make uniform parity: " + solution.uniformArray(nums));
    }
}
