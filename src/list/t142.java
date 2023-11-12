package list;

public class t142 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (flag) {
//            有环，现在找环的入口在哪
            ListNode node = head;
            while (node != slow) {
                node = node.next;
                slow = slow.next;
            }
            return node;
        }
        return null;

    }
}
