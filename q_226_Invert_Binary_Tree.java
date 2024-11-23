// https://leetcode.com/problems/invert-binary-tree/description/

public class q_226_Invert_Binary_Tree {
    public static void main(String[] args) {

        BinaryTreeNode root = new BinaryTreeNode(4);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(7);
        root.left.left = new BinaryTreeNode(1);
        root.left.right = new BinaryTreeNode(3);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(9);

        invertTree(root);

        preorderDFS(root);
    }

    public static BinaryTreeNode invertTree(BinaryTreeNode root) {

        if (root == null)
            return null;

        BinaryTreeNode tempNode = invertTree(root.left);

        root.left = invertTree(root.right);
        root.right = tempNode;

        return root;
    }

    public static void preorderDFS(BinaryTreeNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorderDFS(root.left);
        preorderDFS(root.right);

    }

}
