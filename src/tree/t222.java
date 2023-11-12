package tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class t222 {
    public int countNodes(TreeNode root) {
//        if (root == null) return 0;
//        Deque<TreeNode> treeNodes = new ArrayDeque<>();
//        treeNodes.push(root);
//        int sum = 0;
//        while (!treeNodes.isEmpty()) {
//            TreeNode treeNode = treeNodes.removeFirst();
//            sum++;
//            if (treeNode.left != null) treeNodes.add(treeNode.left);
//            else {
//                sum += treeNodes.size();
//                break;
//            }
//            if (treeNode.right != null) treeNodes.add(treeNode.right);
//            else {
//                sum += treeNodes.size();
//                break;
//            }
//        }
//        return sum;

//        if (root == null) return 0;
//        int leftSum = countNodes(root.left);
//        int rightSum = countNodes(root.right);
//        return leftSum + rightSum + 1;
        if (root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftHeight = 0;
        int rightHeight = 0;
        while (left != null) {
//            求极限左高
            leftHeight++;
            left = left.left;
        }
        while (right != null) {
//            求极限右高
            rightHeight++;
            right = right.right;
        }

        if (leftHeight == rightHeight) return 2 << (leftHeight + 1) - 1;
        else {
            int leftSum = countNodes(root.left);
            int rightSum = countNodes(root.right);
            return leftSum + rightSum + 1;
        }
    }
}
