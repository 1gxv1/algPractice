package list;

public class t206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode tempNode = node.next;
            node.next = prev;
            prev = node;
            node = tempNode;
        }
        return prev;
    }
}
