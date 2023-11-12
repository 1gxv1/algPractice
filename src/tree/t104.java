package tree;

public class t104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int len1 = maxDepth(root.left) + 1;
        int len2 = maxDepth(root.right) + 1;
        return Math.max(len1, len2);
    }
}
