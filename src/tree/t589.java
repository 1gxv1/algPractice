package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class t589 {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.val);
            int len = node.children.size();
            for (int i = len - 1; i >= 0; i--) {
                stack.push(node.children.get(i));
            }
        }
        return list;
    }
}
