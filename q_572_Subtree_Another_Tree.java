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
        System.out.println(isSubtree(root, subRoot));

    }
    public static boolean isSubtree(BinaryTreeNode root, BinaryTreeNode subRoot) {

        if (root == null)
            return false;

        if (subRoot == null)
            return false;

        // For every node, check if the trees are identical
        if (isIdentical(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    public static boolean isIdentical(BinaryTreeNode root1, BinaryTreeNode root2) {

        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        return (root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));

    }
}
