package list;

public class t707 {
    class MyLinkedList {

        int size;
        Node head;

        public MyLinkedList() {
            this.size = 0;
            this.head = new Node(-1);
        }

        public int get(int index) {
            if (index < 0 || index > this.size - 1) return -1;
//          这是第一个节点
            Node cur = this.head.next;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            Node node = new Node(val);
            node.next = this.head.next;
            this.head.next = node;
            this.size++;
        }

        public void addAtTail(int val) {
            Node node = new Node(val);
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
            node.next = null;
            this.size++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > this.size) return;
            Node cur = this.head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            Node node = new Node(val);
            node.next = cur.next;
            cur.next = node;
            this.size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index > this.size - 1) return;
            Node cur = this.head.next;
            Node prev = this.head;
            while (index > 0) {
                prev = cur;
                cur = cur.next;
                index--;
            }
            prev.next = cur.next;
            this.size--;
        }

        class Node {
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
            }


        }
    }
}

