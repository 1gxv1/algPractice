package tree;

import java.util.*;

public class t501 {
    public Map<Integer, Integer> map;

    List<Integer> list = new ArrayList<Integer>();

    public int[] findMode(TreeNode root) {
        find(root);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Map.Entry<Integer, Integer>[] array = entries.toArray(new Map.Entry[0]);
        Arrays.sort(array, (entry1, entry2) -> entry2.getValue() - entry1.getValue());
        int val = array[0].getValue();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getValue() == val) list.add(array[i].getKey());
            else break;
        }
        return list.
    }

    public void find(TreeNode node) {
        if (node == null) return;
        find(node.left);
        int sum = map.getOrDefault(node.val, 1);
        if (sum != 0) map.replace(node.val, ++sum);
        find(node.right);
    }
}
