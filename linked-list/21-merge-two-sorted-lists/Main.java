import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] list1Cases = {
                {1, 2, 4},
                {},
                {}
        };
        int[][] list2Cases = {
                {1, 3, 4},
                {},
                {0}
        };

        Solution solution = new Solution();
        for (int i = 0; i < list1Cases.length; i++) {
            ListNode list1 = buildList(list1Cases[i]);
            ListNode list2 = buildList(list2Cases[i]);
            ListNode merged = solution.mergeTwoLists(list1, list2);
            System.out.println(toList(merged));
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
