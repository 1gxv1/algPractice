package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class t113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        Stack<Integer> path = new Stack<Integer>();
        ArrayList<List<Integer>> lists = new ArrayList<>();
        getPath(root, 0, targetSum, lists, path);
        return lists;
    }

    public void getPath(TreeNode node, int sum, int targetSum, ArrayList<List<Integer>> lists, Stack<Integer> path) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            sum += node.val;
            if (sum == targetSum) {
                path.push(node.val);
                ArrayList<Integer> list = new ArrayList<>(path);
                lists.add(list);
                path.pop();
            }
            return;
        }
        path.push(node.val);
        getPath(node.left, sum + node.val, targetSum, lists, path);
        getPath(node.right, sum + node.val, targetSum, lists, path);
        path.pop();
    }
}