package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class t429 {
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayDeque<Node> nodes = new ArrayDeque<>();
        if (root == null) return lists;
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int len = nodes.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                Node node = nodes.removeFirst();
                list.add(node.val);
                nodes.addAll(node.children);
            }
            lists.add(list);
        }
        return lists;
    }
}
