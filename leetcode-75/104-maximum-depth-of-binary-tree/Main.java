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

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: root = [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        System.out.println("Test Case 1: " + (sol.maxDepth(root1) == 3 ? "Passed" : "Failed"));

        // Example 2: root = [1,null,2]
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        System.out.println("Test Case 2: " + (sol.maxDepth(root2) == 2 ? "Passed" : "Failed"));

        // Empty tree
        System.out.println("Test Case 3: " + (sol.maxDepth(null) == 0 ? "Passed" : "Failed"));
    }
}
