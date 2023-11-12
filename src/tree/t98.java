package tree;

public class t98 {
    double maxValue = Double.NEGATIVE_INFINITY;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean leftFlag = isValidBST(root.left);
        if (root.val > maxValue) maxValue = root.val;
        else return false;
        boolean rightFlag = isValidBST(root.right);
        return leftFlag && rightFlag;
    }


}
