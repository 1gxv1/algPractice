package list;

public class t203 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
//        定义一个node，node的下一个节点为第一个元素，变为带头的链表
        ListNode node = new ListNode();
        ListNode prior = new ListNode();
        ListNode newHead = new ListNode();
        prior.next = head;
        newHead = prior;
        node = head;
        while (node != null) {
            if (node.val == val) {
                prior.next = node.next;
            } else {
                prior = node;
            }
            node = node.next;
        }
        return newHead.next;
    }
}
