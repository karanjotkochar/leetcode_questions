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

        if (root == null)
            return 0;

        // calculate the left and right sub-trees height
        // we get the node which has max height on both the sides

        // diameter of tree is max height of left tree, right tree
        int diameter = heightTree(root.left) + heightTree(root.right);

        int diaLeft = diameterOfBinaryTree(root.left);
        int diaRight = diameterOfBinaryTree(root.right);

        return Math.max(diameter, Math.max(diaLeft, diaRight));
    }

    public static int heightTree(BinaryTreeNode root) {
        if (root == null)
            return 0;

        int height = Math.max(heightTree(root.left), heightTree(root.right)) + 1;

        return height;
    }
}
