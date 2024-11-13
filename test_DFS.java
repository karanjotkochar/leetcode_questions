class Node4 {
    int data;
    Node4 left;
    Node4 right;
    public Node4 (int item) {
        data = item;
        left = null;
        right = null;
    }
}

public class test_DFS {
    public static void main(String[] args) {

        Node4 root = new Node4(1);
        root.left = new Node4(2);
        root.right = new Node4(3);
        root.left.left = new Node4(4);
        root.left.right = new Node4(5);

        methodInorderDFS(root);

    }

    public static void methodInorderDFS(Node4 root) {
        if (root == null)
            return;

        System.out.println(root.left);
        System.out.println(root.data);
        System.out.println(root.right);

    }

    void printInorder(Node4 root) {
        if (root == null)
            return;

        printInorder(root.left);
        printInorder(root.data);
        printInorder(root.right);
    }

    void printInorder() {
        printInorder(root);
    }
}
