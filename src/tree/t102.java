package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class t102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null) return list;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < len; i++) {
                TreeNode dequeFirst = deque.removeFirst();
                temp.add(dequeFirst.val);
                if (dequeFirst.left != null) deque.add(dequeFirst.left);
                if (dequeFirst.right != null) deque.add(dequeFirst.right);
            }
            list.add(temp);
        }
        return list;
    }
}
