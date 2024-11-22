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

        BinaryTreeNode mergedRoot = mergeTrees(root1, root2);
        preorderDFS(mergedRoot);
    }

    public static BinaryTreeNode mergeTrees(BinaryTreeNode root1, BinaryTreeNode root2) {

        // Not required: root1, root2 check implicitly
        // if (root1 == null && root2 == null)

        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;

        root1.data = root1.data + root2.data;

        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }

    public static void preorderDFS(BinaryTreeNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorderDFS(root.left);
        preorderDFS(root.right);

    }
}
