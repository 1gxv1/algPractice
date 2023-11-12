package tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class t404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        int leftValue = sumOfLeftLeaves(root.left);
        int rightValue = sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.left == null && root.left.right == null) {
//            说明此时的root.left是左叶子结点
            leftValue = root.left.val;
        }
        return leftValue + rightValue;
    }
}
