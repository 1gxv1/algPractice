package tree;

import java.util.ArrayDeque;

import java.util.Queue;
import java.util.Stack;

public class t572 {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Queue<TreeNode> treeNodes = new ArrayDeque<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val == subRoot.val) treeNodes.add(node);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        for (TreeNode treeNode : treeNodes) {
            if (isCover(treeNode, subRoot)) return true;
        }
        return false;
    }

    public static boolean isCover(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        else if (root == null && subRoot != null) return false;
        else if (root != null && subRoot == null) return false;
        else if (root.val != subRoot.val) return false;
        boolean inside = isSubtree(root.left, subRoot.left);
        boolean outside = isSubtree(root.right, subRoot.right);
        return inside && outside;
    }

    public static TreeNode createTree(int[] arr) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<TreeNode>();
        TreeNode root = new TreeNode(arr[0]);
        deque.push(root);
        for (int i = 1; i < arr.length; i = i + 2) {
            TreeNode treeNode = deque.remove();
            treeNode.left = new TreeNode(arr[i]);
            treeNode.right = new TreeNode(arr[i + 1]);
            deque.add(treeNode.left);
            deque.add(treeNode.right);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] root = new int[]{3, 4, 5, 1, 2};
        int[] subRoot = new int[]{4, 1, 2};
        TreeNode tree = createTree(root);
        TreeNode subTree = createTree(subRoot);
        isSubtree(tree, subTree);

    }
}
