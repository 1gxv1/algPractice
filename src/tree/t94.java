package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class t94 {
    public static void main(String[] args) {

    }

    //中序遍历：左中右
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root==null) return list;
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        TreeNode current = root;
        while (!deque.isEmpty() || current != null) {
            if (current != null) {
                deque.push(current);
                current = current.left;
            } else {
                TreeNode pop = deque.pop();
                list.add(pop.val);
                current = pop.right;
            }
        }
        return list;
    }
}
