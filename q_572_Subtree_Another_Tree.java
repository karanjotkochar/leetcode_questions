// https://leetcode.com/problems/subtree-of-another-tree/description/

public class q_572_Subtree_Another_Tree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(3);
        root.left = new BinaryTreeNode(4);
        root.right = new BinaryTreeNode(5);
        root.left.left = new BinaryTreeNode(1);
        root.left.right = new BinaryTreeNode(2);

        BinaryTreeNode subRoot = new BinaryTreeNode(4);
        subRoot.left = new BinaryTreeNode(1);
        subRoot.right = new BinaryTreeNode(2);

        isSubtree(root, subRoot);

    }
    public static boolean isSubtree(BinaryTreeNode root, BinaryTreeNode subRoot) {

        return false;
    }
}
