package tree_ds;

import java.util.LinkedList;
import java.util.Queue;

public class test_deletion {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(2);
        root.left = new BinaryTreeNode(3);
        root.right = new BinaryTreeNode(4);
        root.left.left = new BinaryTreeNode(5);
        root.left.right = new BinaryTreeNode(6);

        int key = 3;

        inorderTraversal(root);
        System.out.println();

        deleteElement(root, key);
        inorderTraversal(root);

    }

    public static void deleteElement(BinaryTreeNode root, int key) {

        // Empty tree
        if (root == null);


//        Queue<BinaryTreeNode> queue = new LinkedList<>();
//        queue.add(root);

      // To Do: Add deletion code


    }

    public static void inorderTraversal(BinaryTreeNode root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
}
