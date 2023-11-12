package tree;

public class t110 {
    public boolean isBalanced(TreeNode root) {
        return calculateHeight(root) != -1;
    }

    public int calculateHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = calculateHeight(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = calculateHeight(node.right);
        if (rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        else return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

}
