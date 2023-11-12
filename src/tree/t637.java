package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class t637 {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        if (root == null) return list;
        ArrayDeque<TreeNode> treeNodes = new ArrayDeque<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()) {
            int len = treeNodes.size();
            double sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode node = treeNodes.removeFirst();
                sum += node.val;
                if (node.left != null) treeNodes.add(node.left);
                if (node.right != null) treeNodes.add(node.right);
            }
            list.add(sum / len);
        }
        return list;
    }
}
