import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] testCases = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6}
        };

        Solution solution = new Solution();
        for (int[] testCase : testCases) {
            ListNode head = buildList(testCase);
            ListNode middle = solution.middleNode(head);
            System.out.println(toList(middle));
        }
    }

    private static ListNode buildList(int[] values) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }

        return dummy.next;
    }

    private static List<Integer> toList(ListNode head) {
        List<Integer> values = new ArrayList<>();

        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        return values;
    }
}
