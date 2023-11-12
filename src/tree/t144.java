package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class t144 {
    class Solution {

        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            ArrayList<Integer> list = new ArrayList<>();
                if (root == null) return list;
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                list.add(node.val);
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
            }
            return list;
        }

    }
}
