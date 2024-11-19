import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/path-sum/description/
class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4() {}
    TreeNode4(int val) {
        this.val = val;
    }
    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class q_112_Path_Sum {
    public static void main(String[] args) {

        TreeNode4 root = null;
        root = new TreeNode4(5);
        root.left = new TreeNode4(4);
        root.right = new TreeNode4(8);
        root.left.left = new TreeNode4(11);
        root.left.left.left = new TreeNode4(7);
        root.left.left.right = new TreeNode4(2);
        root.right.left = new TreeNode4(13);
        root.right.right = new TreeNode4(4);
        root.right.right.right = new TreeNode4(1);

        int targetSum = 22;
//        boolean val = hasPathSum(root, targetSum);
//        System.out.println(val);

        printRootLeafNodePath(root);
    }

    public static boolean hasPathSum(TreeNode4 root, int targetSum) {

        if (root == null)
            return false;


    return false;
    }

    public static void printRootLeafNodePath(TreeNode4 root) {

        printRootLeafNodePath(root.left);
        System.out.println(root.left);
    }
}
