package tree;

import java.util.*;

public class t257 {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> strings = new ArrayList<>();
//        if (root == null) return strings;
//        getPath(root, strings);
//        return strings;
//    }
//
//    public void getPath(TreeNode node, List<String> list) {
//        if (node.left == null && node.right == null) {
////            此时到达一个叶子结点，应该开辟一条道路
//            list.add(String.valueOf(node.val));
//        } else {
//            String s = node.val + "->";
//            if (node.left != null) {
//                int size = list.size();
//                getPath(node.left, list);
//                updateList(list, size, s);
//            }
//            if (node.right != null) {
//                int size = list.size();
//                getPath(node.right, list);
//                updateList(list, size, s);
//            }
//        }
//    }
//
//    public void updateList(List<String> list, int size, String s) {
//        int sub = list.size() - size;
//        for (int i = 1; i <= sub; i++) {
//            String concat = s.concat(list.get(list.size() - i));
//            int pos = list.size() - i;
//            list.remove(list.size() - i);
//            list.add(pos, concat);
//        }
//    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if (root == null) return list;
        calculateList(root, list, stack);
        return list;
    }

    public void calculateList(TreeNode node, List<String> list, Stack<Integer> stack) {
        if (node.left == null && node.right == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < stack.size(); i++) {
                stringBuilder.append(stack.get(i)).append("->");
            }
            stringBuilder.append(node.val);
            list.add(stringBuilder.toString());
        } else {
            if (node.left != null) {
                stack.push(node.val);
                calculateList(node.left, list, stack);
                stack.pop();
            }
            if (node.right != null) {
                stack.push(node.val);
                calculateList(node.right, list, stack);
                stack.pop();
            }
        }
    }
}
