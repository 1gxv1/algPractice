package tree;

public class t700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.left != null && val < root.val) return searchBST(root.left, val);
        if (root.right != null && val > root.val) return searchBST(root.right, val);
        return null;
    }
}
