package tree;

import java.util.*;

public class t107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        ArrayList<List<Integer>> lists = new ArrayList<>();
        if (root == null) return lists;
        deque.add(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode treeNode = deque.removeFirst();
                if (treeNode.left != null) deque.add(treeNode.left);
                if (treeNode.right != null) deque.add(treeNode.right);
                list.add(treeNode.val);
            }
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
    }
}
