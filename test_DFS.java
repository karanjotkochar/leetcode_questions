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
        System.out.println();
        methodPreorderDFS(root);
        System.out.println();
        methodPostorderDFS(root);

    }

    public static void methodInorderDFS(Node4 root) {

        if (root == null)
            return;

        methodInorderDFS(root.left);
        System.out.print(root.data + " ");
        methodInorderDFS(root.right);

    }

    public static void methodPreorderDFS(Node4 root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");
        methodPreorderDFS(root.left);
        methodPreorderDFS(root.right);

    }

    public static void methodPostorderDFS(Node4 root) {

        if (root == null)
            return;

        methodPostorderDFS(root.left);
        methodPostorderDFS(root.right);
        System.out.print(root.data + " ");

    }
}
