// Traversal
// Level Order Traversal -- BFS

import java.util.LinkedList;
import java.util.Queue;

class Node3 {
    int data;
    Node3 left;
    Node3 right;
    public Node3 (int item) {
        data = item;
        left = null;
        right = null;
    }
}

public class test_Binary_Tree_Treversal {
    public static void main(String[] args) {
        Node3 root = new Node3(1);
        root.left = new Node3(2);
        root.right = new Node3(3);
        root.left.left = new Node3(4);
        root.left.right = new Node3(5);

        methodBFS1(root); // using Recursion
        methodBFS2(root); // using Queue
    }

    public static void methodBFS1(Node3 root) {

        // Brute force approach: Height of tree, print at each level

        // Get height of tree
        int h = height(root);
        int i;
        for (i=1; i<=h; i++) {
            printCurrentLevel(root, i);
            System.out.println();
        }
    }

    public static int height(Node3 root) {

        // Height of tree
        if (root == null)
            return 0;
        else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if (lHeight > rHeight)
                return lHeight + 1;
            else
                return rHeight + 1;
        }

    }
    public static void printCurrentLevel (Node3 root, int level) {

        // print nodes at the CURRENT LEVEL
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public static void methodBFS2(Node3 root) {

        Queue<Node3> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node3 current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);

        }

    }


}
