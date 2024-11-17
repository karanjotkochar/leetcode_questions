package tree_ds;

import java.util.LinkedList;
import java.util.Queue;

public class test_insertion {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(3);
        root.right = new BinaryTreeNode(4);
        root.left.left = new BinaryTreeNode(5);

        int key = 6;

        inorderTraversal(root);
        System.out.println();

        BinaryTreeNode newRoot = insertElement(root, key);
        inorderTraversal(newRoot);

    }

    public static BinaryTreeNode insertElement(BinaryTreeNode root, int key) {

        // Empty Tree
        if (root == null)
            return new BinaryTreeNode(key);

        // Use BFS/Level order traversal
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();

            if (temp.left == null) {
                // If left is Empty, add there
                temp.left = new BinaryTreeNode(key);
                break;

            } else {
                // If left is present, add to queue
                queue.add(temp.left);
            }

            if (temp.right == null) {
                // If right is Empty, add there
                temp.right = new BinaryTreeNode(key);
                break;

            } else {
                // If right is present, add to queue
                queue.add(temp.right);
            }

        }

        return root;
    }

    public static void inorderTraversal(BinaryTreeNode root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

}
