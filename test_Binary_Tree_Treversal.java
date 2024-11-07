// Traversal
// Level Order Traversal -- BFS

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

        methodBFS1(root);
    }

    public static void methodBFS1(Node3 root) {

        // Brute force approach: Height of tree, print at each level

        // Get height of tree
        int h = height(root);


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
}
