package list;

public class ListNode {
    //    节点的值
    int val;
    //    下一个节点
    ListNode next;

    //节点的无参构造
    public ListNode() {
    }

    //节点的单参数构造
    public ListNode(int val) {
        this.val = val;
    }

    //节点的双参数构造
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
