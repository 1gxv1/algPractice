package tree;


import java.util.Arrays;

public class t106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0) return null;

        int val = postorder[postorder.length - 1];
        TreeNode treeNode = new TreeNode(val);

        if (postorder.length == 1) return treeNode;

        int index = 0;
//        找到分割点
        while (index < inorder.length) {
            if (inorder[index] == val) {
                break;
            }
            index++;
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, index);
        int[] rightInorder = Arrays.copyOfRange(inorder, index + 1, inorder.length);

        System.out.println("leftInorder:" + Arrays.toString(leftInorder));
        System.out.println("rightInorder:" + Arrays.toString(rightInorder));


        int[] leftPostOrder = Arrays.copyOfRange(postorder, 0, leftInorder.length);
        int[] rightPostOrder = Arrays.copyOfRange(postorder, leftInorder.length, postorder.length - 1);


        System.out.println("leftPostOrder:" + Arrays.toString(leftPostOrder));
        System.out.println("rightPostOrder:" + Arrays.toString(rightPostOrder));

        treeNode.left = buildTree(leftInorder, leftPostOrder);
        treeNode.right = buildTree(rightInorder, rightPostOrder);
        return treeNode;
    }

}
