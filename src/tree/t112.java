package tree;

public class t112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return getSum(root, 0, targetSum);
    }

    public boolean getSum(TreeNode node, int sum, int targetSum) {
        if (node == null) return false;
        if (node.left == null && node.right == null) {
            sum += node.val;
            return sum == targetSum;
        }
        boolean leftBoolean = getSum(node.left, sum + node.val, targetSum);
        boolean rightBoolean = getSum(node.right, sum + node.val, targetSum);
        return leftBoolean || rightBoolean;
    }

}
