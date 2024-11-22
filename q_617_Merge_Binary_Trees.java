// https://leetcode.com/problems/merge-two-binary-trees/description/

public class q_617_Merge_Binary_Trees {
    public static void main(String[] args) {
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        root1.left = new BinaryTreeNode(3);
        root1.right = new BinaryTreeNode(2);
        root1.right.left = new BinaryTreeNode(5);

        BinaryTreeNode root2 = new BinaryTreeNode(2);
        root2.left = new BinaryTreeNode(1);
        root2.right = new BinaryTreeNode(3);
        root2.left.right = new BinaryTreeNode(4);
        root2.right.right = new BinaryTreeNode(7);

        mergeTrees(root1, root2);
    }

    public static BinaryTreeNode mergeTrees(BinaryTreeNode root1, BinaryTreeNode root2) {

        return null;
    }
}
