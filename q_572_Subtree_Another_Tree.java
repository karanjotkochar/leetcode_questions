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

        // TO DO

        if (root.data == subRoot.data) {
            System.out.println("root.data = " + root.data + " and subRoot data: " + subRoot.data);
            if (root.left == subRoot.left && root.right == subRoot.right)
                return true;
            else
                return false;
        }

        isSubtree(root.left, subRoot);
        isSubtree(root.right, subRoot);

        return false;
    }
}
