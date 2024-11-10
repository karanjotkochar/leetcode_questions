// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2() {}
    TreeNode2(int val) {
        this.val = val;
    }
    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class q_111_Minimum_Depth_Binary_Tree {
    public static void main(String[] args) {

        TreeNode2 root = null;

        root = new TreeNode2(3);
        root.left = new TreeNode2(9);
        root.right = new TreeNode2(20);
        root.right.left = new TreeNode2(15);
        root.right.right = new TreeNode2(7);

        minDepth(root);
        System.out.println(minDepth(root));
    }
    public static int minDepth(TreeNode2 root) {

        // Depth of tree
        // Brute force approach: Recursion
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return minDepth(root.right) + 1;
        if (root.right == null)
            return minDepth(root.left) + 1;

        int minDepthAns;
        minDepthAns = Math.min(minDepth(root.left), minDepth(root.right)) + 1;

        return minDepthAns;
    }
}