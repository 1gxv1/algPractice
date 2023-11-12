package list;

public class t24 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        head = head.next;
        while (prev.next != null && prev.next.next != null) {
            ListNode firstNode = prev.next;
            ListNode secondNode = firstNode.next;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            prev.next = secondNode;
            prev = prev.next.next;
        }
        return head;
    }
}
