// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

public class q_104_Maximum_Depth_Binary_Tree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(3);
        root.left = new BinaryTreeNode(9);
        root.right = new BinaryTreeNode(20);
        root.right.left = new BinaryTreeNode(15);
        root.right.right = new BinaryTreeNode(7);

        maxDepth(root);
    }
    public static int maxDepth(BinaryTreeNode root) {

        return 0;
    }
}
