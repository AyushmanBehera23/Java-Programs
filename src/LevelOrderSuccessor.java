import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderSuccessor {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    static TreeNode findSuccessor(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
            if (current.val == target) {
                return queue.peek();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(8);
        TreeNode ans = findSuccessor(root, 7);

        if (ans != null) {
            System.out.println("Successor: " + ans.val);
        } else {
            System.out.println("No Successor");
        }
    }
}