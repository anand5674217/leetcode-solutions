package leetcode_75.binary_tree_right_side_view;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                
                // If it's the last node in the current level, add it to result
                if (i == levelSize - 1) {
                    result.add(currentNode.val);
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: root = [1,2,3,null,5,null,4]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);
        System.out.println("Example 1: " + sol.rightSideView(root1));
        // Expected: [1, 3, 4]

        // Example 2: root = [1,2,3,4,null,null,null,5]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.left.left = new TreeNode(5);
        System.out.println("Example 2: " + sol.rightSideView(root2));
        // Expected: [1, 3, 4, 5]

        // Example 3: root = [1,null,3]
        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(3);
        System.out.println("Example 3: " + sol.rightSideView(root3));
        // Expected: [1, 3]

        // Example 4: root = []
        System.out.println("Example 4: " + sol.rightSideView(null));
        // Expected: []
    }
}
