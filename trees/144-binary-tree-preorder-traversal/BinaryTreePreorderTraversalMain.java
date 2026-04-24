import java.util.List;

public class BinaryTreePreorderTraversalMain {

    public static void main(String[] args) {
        BinaryTreePreorderTraversalSolution solution = new BinaryTreePreorderTraversalSolution();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result = solution.preorderTraversal(root);
        System.out.println(result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
