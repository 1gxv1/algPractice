package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class t515 {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<TreeNode> treeNodes = new ArrayDeque<>();
        if (root == null) return list;
        treeNodes.add(root);
        while (!treeNodes.isEmpty()) {
            int len = treeNodes.size();
            int max = treeNodes.getFirst().val;
            for (int i = 0; i < len; i++) {
                TreeNode treeNode = treeNodes.removeFirst();
                if (treeNode.val > max) max = treeNode.val;
                if (treeNode.left != null) treeNodes.add(treeNode.left);
                if (treeNode.right != null) treeNodes.add(treeNode.right);
            }
            list.add(max);
        }
        return list;
    }
}
