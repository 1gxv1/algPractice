package tree;

public class t101 {
    public boolean isSymmetric(TreeNode root) {
//       左子树通过左右中的顺序访问和右子树通过右左中的顺序进行访问，每次遍历访问的时候比较节点的val
        if (root == null) return true;
        return compareTwoNode(root.left, root.right);
    }

    public boolean compareTwoNode(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null && right != null) return false;
        else if (right == null && left != null) return false;
        else if (left.val != right.val) return false;

        boolean outside = compareTwoNode(left.left, right.right);
        boolean inside = compareTwoNode(left.right, right.left);
        return outside && inside;
    }

}
