package list;

public class t02_07 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = 0;
        int lenB = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != null) {
            lenA++;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            lenB++;
            nodeB = nodeB.next;
        }
        while (lenA - lenB > 0) {
            headA = headA.next;
            lenB++;
        }
        while (lenB - lenA > 0) {
            headB = headB.next;
            lenA++;
        }
        while (headA != null) {
            if (headA == headB) break;
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
