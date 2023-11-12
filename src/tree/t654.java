package tree;

import java.util.Arrays;

public class t654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructByNums(nums, 0, nums.length);
    }

    public TreeNode constructByNums(int[] nums, int start, int end) {
        if (end == start || end < start) return null;
        if (end - start == 1) return new TreeNode(nums[start]);
        int maxNums = -1;
        int index = -1;
        for (int i = start; i < end; i++) {
            if (nums[i] > maxNums) {
                maxNums = nums[i];
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(maxNums);
        treeNode.left = constructByNums(nums, start, index);
        treeNode.right = constructByNums(nums, index + 1, end);
        return treeNode;
    }
}
