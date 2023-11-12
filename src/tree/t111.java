package tree;

public class t111 {
    public int minDepth(TreeNode root) {
//        确定边界条件，当遍历到叶子结点的时候跳出
        if (root == null) return 0;
        if (root.left == null && root.right != null) return minDepth(root.right) + 1;
        else if (root.left != null && root.right == null) return minDepth(root.left) + 1;
        else return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
