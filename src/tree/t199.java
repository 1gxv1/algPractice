package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class t199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) return list;
        Deque<TreeNode> treeNodes = new ArrayDeque<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()) {
            int len = treeNodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode treeNode = treeNodes.removeFirst();
                if (i == len - 1) list.add(treeNode.val);
                if (treeNode.left != null) treeNodes.add(treeNode.left);
                if (treeNode.right != null) treeNodes.add(treeNode.right);
            }
        }
        return list;
    }
}
