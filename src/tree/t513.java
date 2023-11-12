package tree;

public class t513 {
    public int findBottomLeftValue(TreeNode root) {
        int height = 1;
        return calculateValByHeight(root, height).val;
    }

    public heightAndValue calculateValByHeight(TreeNode node, int height) {
        if (node == null) return new heightAndValue(-1, -1);
        if (node.left == null && node.right == null) return new heightAndValue(node.val, height);
        heightAndValue left = calculateValByHeight(node.left, height + 1);
        heightAndValue right = calculateValByHeight(node.right, height + 1);
        return right.height > left.height ? right : left;
    }

    public static class heightAndValue {
        int val;
        int height;

        heightAndValue(int val, int height) {
            this.val = val;
            this.height = height;
        }

    }

}
