// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

import java.util.LinkedList;
import java.util.Queue;

public class q_104_Maximum_Depth_Binary_Tree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(3);
        root.left = new BinaryTreeNode(9);
        root.right = new BinaryTreeNode(20);
        root.right.left = new BinaryTreeNode(15);
        root.right.right = new BinaryTreeNode(7);

        maxDepth(root);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(BinaryTreeNode root) {

        // Edge case: Tree is empty
        if (root == null)
            return 0;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        int count = 0;

        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();

            if (current == null) {
                count++;
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                if (current.left != null)
                    queue.add(current.left);

                if (current.right != null)
                    queue.add(current.right);

            }
        }

        return count;
    }
}
