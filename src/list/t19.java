package list;

public class t19 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode node = head;
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        ListNode prev = newHead;
        while (node != null) {
            prev = prev.next;
            node = node.next;
        }
        prev.next = prev.next.next;
        return newHead.next;
    }
}
