package tree;

import java.util.Stack;

public class t226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
//            交换左右孩子
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return root;
    }
}
