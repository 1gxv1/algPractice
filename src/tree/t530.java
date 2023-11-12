package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t530 {
    double cha = Double.POSITIVE_INFINITY;

    public TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return (int) cha;
    }

    public void getMin(TreeNode node) {
        if (node == null) return;
        getMin(node.left);
        if (pre != null) {
            cha = Math.min(cha, node.val - pre.val);
        }
        pre = node;
        getMin(node.right);
    }


}