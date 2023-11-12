package tree;

import java.util.Arrays;

public class t105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;

        int val = preorder[0];
        TreeNode node = new TreeNode(val);

        if (preorder.length == 1) return node;

        int index = 0;
        while (index < inorder.length) {
            if (inorder[index] == val) break;
            index++;
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, index);
        int[] rightInorder = Arrays.copyOfRange(inorder, index + 1, inorder.length);

//        System.out.println("leftInorder:" + Arrays.toString(leftInorder));
//        System.out.println("rightInorder:" + Arrays.toString(rightInorder));

        int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, leftInorder.length + 1);
        int[] rightPreOrder = Arrays.copyOfRange(preorder, leftInorder.length + 1, preorder.length);

//        System.out.println("leftPreOrder:" + Arrays.toString(leftPreOrder));
//        System.out.println("rightPreOrder:" + Arrays.toString(rightPreOrder));

        node.left = buildTree(leftPreOrder,leftInorder);
        node.right = buildTree(rightPreOrder,rightInorder);

        return node;
    }
}
