import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversalSolution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        traverse(root, values);
        return values;
    }

    private void traverse(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        values.add(root.val);
        traverse(root.left, values);
        traverse(root.right, values);
    }
}
