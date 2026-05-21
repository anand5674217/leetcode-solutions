public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode head1 = createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.print("Example 1: ");
        printLinkedList(solution.oddEvenList(head1)); // Expected: [1, 3, 5, 2, 4]

        // Example 2
        ListNode head2 = createLinkedList(new int[]{2, 1, 3, 5, 6, 4, 7});
        System.out.print("Example 2: ");
        printLinkedList(solution.oddEvenList(head2)); // Expected: [2, 3, 6, 7, 1, 5, 4]
    }

    private static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append(",");
            current = current.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
