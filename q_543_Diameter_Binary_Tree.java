// https://leetcode.com/problems/diameter-of-binary-tree/description/

public class q_543_Diameter_Binary_Tree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        diameterOfBinaryTree(root);
        System.out.println(diameterOfBinaryTree(root));

    }
    public static int diameterOfBinaryTree(BinaryTreeNode root) {

        // TO DO

        return 0;
    }
}
